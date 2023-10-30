package com.connect.demo.DAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;
import com.connect.demo.DTO.EmployeeDTO;
public class EmployeeDAO {
    private SessionFactory sessionFactory;

    public EmployeeDAO() {
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(EmployeeDTO.class);
        sessionFactory = cfg.buildSessionFactory();
    }

    public void create(EmployeeDTO dto) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(dto);
            tx.commit();
        } catch (Exception e) {
            System.out.println(e);
            tx.rollback();
        } finally {
            session.close();
        }
    }

    public List<EmployeeDTO> retrieveAllEmployees() {
        Session session = sessionFactory.openSession();
        try {
            String hql = "FROM EmployeeDTO";
            List<EmployeeDTO> employees = session.createQuery(hql).list();
            return employees;
        } finally {
            session.close();
        }
    }

    public void deleteEmployeesByDeptno(int deptno) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.createQuery("DELETE FROM EmployeeDTO WHERE deptno = :deptno")
                    .setParameter("deptno", deptno)
                    .executeUpdate();
            tx.commit();
        } catch (Exception e) {
            System.out.println(e);
            tx.rollback();
        } finally {
            session.close();
        }
    }

    public void updateSalaries(int oldSalary, int newSalary) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.createQuery("UPDATE EmployeeDTO SET sal = :newSalary WHERE sal = :oldSalary")
                    .setParameter("newSalary", newSalary)
                    .setParameter("oldSalary", oldSalary)
                    .executeUpdate();
            tx.commit();
        } catch (Exception e) {
            System.out.println(e);
            tx.rollback();
        } finally {
            session.close();
        }
    }
    
    public List<EmployeeDTO> retrieveEmployeesWithNameStartingWithA() {
    	Session session = sessionFactory.openSession();
        try {
            String sql = "SELECT * FROM Employee WHERE ENAME LIKE 'A%'";
            List<EmployeeDTO> employees = session.createSQLQuery(sql)
                    .addEntity(EmployeeDTO.class)
                    .list();
            return employees;
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
        }
    }
    
    public List<EmployeeDTO> retrieveEmployeesSalaryInBtw() {
    	Session session = sessionFactory.openSession();
        try {
            String sql = "SELECT * FROM Employee WHERE sal BETWEEN 5000 AND 7000";
            List<EmployeeDTO> employees = session.createSQLQuery(sql)
                    .addEntity(EmployeeDTO.class)
                    .list();
            return employees;
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
        }
    }
    
    public List<EmployeeDTO> retrieveSecondMinMax() {
    	Session session = sessionFactory.openSession();
        try {
            String sql = "SELECT E.* FROM Employee E JOIN (SELECT empno FROM Employee WHERE sal = (SELECT MIN(sal) FROM Employee WHERE sal > (SELECT MIN(sal) FROM Employee)) UNION SELECT empno FROM Employee WHERE sal = (SELECT MAX(sal) FROM Employee WHERE sal < (SELECT MAX(sal) FROM Employee))) AS Subquery ON E.empno = Subquery.empno;";
            List<EmployeeDTO> employees = session.createSQLQuery(sql)
                    .addEntity(EmployeeDTO.class)
                    .list();
            return employees;
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
        }
    }
    
    public void executeUpdateQuery() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String sql = "UPDATE Employee AS e1 JOIN (SELECT sal FROM Employee GROUP BY sal HAVING COUNT(*) > 1) AS e2 ON e1.sal = e2.sal SET e1.sal = 5000";
            session.createSQLQuery(sql).executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
    }
    
    public void closeSessionFactory() {
        if (sessionFactory != null && !sessionFactory.isClosed()) {
            sessionFactory.close();
        }
    }
}
