package org.burcovschi.spring.hibernate_one2many_uni;

import org.burcovschi.spring.hibernate_one2many_uni.entity.Department;
import org.burcovschi.spring.hibernate_one2many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try{
            session = sessionFactory.getCurrentSession();
            Department dep = new Department("HR",300,1200);

            Employee emp1 = new Employee("Vitale","Burcovschi",300);
            Employee emp2 = new Employee("Andrei","Popa",800);
            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);

            session.beginTransaction();
            session.save(dep);
            session.getTransaction().commit();

        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
