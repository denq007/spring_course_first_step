package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2Get1Line {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            Employee emp = new Employee("Oleg", "Sidorov", "HR", 700);
            session.beginTransaction();//открываем
            session.save(emp);
       //     session.getTransaction().commit();//обязательно закрываем, адже если селектим

            int myId=emp.getId();
    //        session=sessionFactory.getCurrentSession();
   //         session.beginTransaction();
            Employee employee=session.get(Employee.class,myId);
            session.getTransaction().commit();
            System.out.println(employee);
        }finally {
            sessionFactory.close();
        }

    }


}
