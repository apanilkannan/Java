package com.many.demo.Util;
import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.many.demo.DTO.CompanyDTO;
import com.many.demo.DTO.ProductDTO;
public class Tester {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(CompanyDTO.class);
        cfg.addAnnotatedClass(ProductDTO.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        CompanyDTO company1 = new CompanyDTO();
        company1.setCompanyName("Dell");
        company1.setCompanyDescription("Its dell");
        company1.setProducts(new HashSet<>()); 
        CompanyDTO company2 = new CompanyDTO();
        company2.setCompanyName("Acer");
        company2.setCompanyDescription("Im acer");
        company2.setProducts(new HashSet<>()); 
        ProductDTO product1 = new ProductDTO();
        product1.setProductName("inspiron");
        product1.setProductDescription("inspiron d45");
        ProductDTO product2 = new ProductDTO();
        product2.setProductName("aspiron");
        product2.setProductDescription("aspiron a34");
        company1.getProducts().add(product1);
        company1.getProducts().add(product2);
        company2.getProducts().add(product1);
        session.save(company1);
        session.save(company2);
        session.save(product1);
        session.save(product2);
        tx.commit();
        session.close();
        factory.close();
    }
}