package org.burcovschi.spring.hibernate.hibernate_one2one;

import org.burcovschi.spring.hibernate.hibernate_one2one.entity.Details;
import org.burcovschi.spring.hibernate.hibernate_one2one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        Session session = null;
        try{
            session = sessionFactory.getCurrentSession();
/*            Employee employee = new Employee("Nicolai", "Patrascu","Sales",700);
            Details details = new Details("Bucuresti","3736942342342","sales@gmail.com");
            details.setEmployee(employee);
            employee.setEmpDetail(details);*/


            session.beginTransaction();
            Details details = session.get(Details.class,3);
            session.delete(details);

            session.getTransaction().commit();

        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
