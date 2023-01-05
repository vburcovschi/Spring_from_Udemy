package org.burcovschi.spring.hibernate.hibernate_many2many;

import org.burcovschi.spring.hibernate.hibernate_many2many.entity.Child;
import org.burcovschi.spring.hibernate.hibernate_many2many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try{
/*            session = sessionFactory.getCurrentSession();

            Section section1 = new Section("Football");
            Child child1 = new Child("Vitalie", 6);
            Child child2 = new Child("Ion", 5);
            Child child3 = new Child("Petru", 12);
            Child child4 = new Child("Vasile", 8);

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);
            section1.addChildToSection(child4);

            session.beginTransaction();
            //session.save(section1);
            session.persist(section1);
            session.getTransaction().commit();*/

            //****************************************************************

/*            session = sessionFactory.getCurrentSession();

            Section section1 = new Section("Valleyball");
            Section section2 = new Section("Chess");
            Section section3 = new Section("Math");
            Child child1 = new Child("Vitalie", 6);
            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);

            session.beginTransaction();
            session.save(child1);
            session.getTransaction().commit();*/

/*            //****************************************************************

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Section section1 = session.get(Section.class,1);
            System.out.println(section1);
            System.out.println(section1.getChildren());
            session.getTransaction().commit();*/


/*            //****************************************************************

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Child child = session.get(Child.class,4);
            System.out.println(child);
            System.out.println(child.getSections());
            session.getTransaction().commit();*/

/*            //****************************************************************

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Section section = session.get(Section.class,1);
            session.delete(section);
            session.getTransaction().commit();*/

            //****************************************************************

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Child child = session.get(Child.class,5);
            System.out.println(child);
            //session.delete(child);
            session.getTransaction().commit();

        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
