package org.burcovschi.spring.hibernate.hibernate_elementary;


import org.burcovschi.spring.hibernate.hibernate_elementary.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                buildSessionFactory();

        Employee employee = new Employee("Marina",
                "Calasnicov",
                "HR",
                500);
        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class,1);
            emp.setSalary(1500);
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            sessionFactory.close();
        }
    }
}
