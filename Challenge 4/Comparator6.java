package com.hello.core.P4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student implements Comparable<Student> {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}
public class Comparator6  {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));
        Collections.sort(students);
        System.out.println("Sorted by ID (Comparable):");
        for (Student student : students) {
            System.out.println(student);
        }
        Comparator<Student> nameComparator = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };
        Collections.sort(students, nameComparator);
        System.out.println("\nSorted by Name (Comparator):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
