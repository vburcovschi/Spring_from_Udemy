package org.burcovschi.spring.hibernate.hibernate_one2many_bi;

import org.burcovschi.spring.hibernate.hibernate_one2many_bi.entity.Department;
import org.burcovschi.spring.hibernate.hibernate_one2many_bi.entity.Employee;
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

/*            Department dep = new Department("IT",300,1200);

            Employee emp1 = new Employee("Vitalie","Burcovschi",300);
            Employee emp2 = new Employee("Elena","Burcovschi",1300);

            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);

            session.beginTransaction();
            session.save(dep);

            session.getTransaction().commit();*/

            session.beginTransaction();
            //Department dep = session.get(Department.class,1);
            Employee emp1 = session.get(Employee.class,1);
            session.delete(emp1);


            session.getTransaction().commit();

        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
