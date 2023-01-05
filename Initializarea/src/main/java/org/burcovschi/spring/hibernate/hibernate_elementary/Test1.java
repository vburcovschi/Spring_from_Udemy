package org.burcovschi.spring.hibernate.hibernate_elementary;


import org.burcovschi.spring.hibernate.hibernate_elementary.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                buildSessionFactory();

        Employee employee = new Employee("Ion",
                "Magic",
                "Juridic",
                500);
        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
