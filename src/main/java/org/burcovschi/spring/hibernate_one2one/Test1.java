package org.burcovschi.spring.hibernate_one2one;

import org.burcovschi.spring.hibernate_one2one.entity.Employee;
import org.burcovschi.spring.hibernate_one2one.entity.Details;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try{
            Employee employee = new Employee("Oleg", "Mosanu","Sales",700);
            Details details = new Details("London","3736942342342","sales@gmail.com");
            employee.setEmpDetail(details);
            session.beginTransaction();
            Employee emp  = session.get(Employee.class,2);
            session.save(emp);
            System.out.println(emp );
            session.getTransaction().commit();

        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
