package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4SetNewValue {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();//открываем
           // Employee emp=session.get(Employee.class,1);
          //  emp.setSalary(1500);
            session.createQuery("update Employee set salary=1000"+"where name='Mixail'").executeUpdate();
            session.getTransaction().commit();

        }finally {
            sessionFactory.close();
        }

    }


}
