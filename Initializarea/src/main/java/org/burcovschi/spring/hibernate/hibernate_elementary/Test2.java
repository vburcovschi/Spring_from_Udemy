package org.burcovschi.spring.hibernate.hibernate_elementary;


import org.burcovschi.spring.hibernate.hibernate_elementary.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
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
            session.save(employee);
            session.getTransaction().commit();

            int myId = employee.getId();
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Employee newEmployee = session.get(Employee.class,myId);
            session.getTransaction().commit();

            System.out.println(newEmployee);
            System.out.println("Done!");
        } finally {
            sessionFactory.close();
        }
    }
}
