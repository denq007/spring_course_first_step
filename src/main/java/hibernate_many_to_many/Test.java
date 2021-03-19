package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session=  null;
        try {
            /*session=sessionFactory.getCurrentSession();
            Section section1=new Section("Football");
            Child child1=new Child("Zaur",5);
            Child child2=new Child("Masha",7);
            Child child3=new Child("Vasya",6);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);
            session.beginTransaction();
            session.save(section1);
            session.getTransaction().commit();*/
         /*   session=sessionFactory.getCurrentSession();
            Section section1=new Section("Voleibol");
            Section section2=new Section("Chess");
            Section section3=new Section("Math");
            Child child1=new Child("Igot",10);
            child1.addSectionToList(section1);
            child1.addSectionToList(section2);
            child1.addSectionToList(section3);
            session.beginTransaction();
            session.save(child1);
            session.getTransaction().commit();*/
/*            session=sessionFactory.getCurrentSession();

            session.beginTransaction();
            Section section=session.get(Section.class,4);
            System.out.println(section);
            System.out.println(section.getChildList());
            session.getTransaction().commit();*/

           /* session=sessionFactory.getCurrentSession();

            session.beginTransaction();
            Child child=session.get(Child.class,4);
            System.out.println(child);
            System.out.println(child.getSectionList());
            session.getTransaction().commit();*/
            session=sessionFactory.getCurrentSession();

            session.beginTransaction();
            Section section=session.get(Section.class,4);
            session.delete(section);
            session.getTransaction().commit();


        }finally {
            session.close();
            sessionFactory.close();
        }
    }
}
