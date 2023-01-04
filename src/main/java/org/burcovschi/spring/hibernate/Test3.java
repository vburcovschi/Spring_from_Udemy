package org.burcovschi.spring.hibernate;


import org.burcovschi.spring.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
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
            List<Employee> emps = session.createQuery("from Employee " +
                    "where name = 'Vitalie'").getResultList();
            for (Employee e: emps) {
                System.out.println(e);

            }
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            sessionFactory.close();
        }
    }
}
