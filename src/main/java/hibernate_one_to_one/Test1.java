package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session=null;
        try {
    /*        Session session = sessionFactory.getCurrentSession();
            Employee employee=new Employee("Zaur","Tregulov","IT",500);
            Detail detail=new Detail("Baku","123456789","zaul@gmail.com");
            employee.setDetail(detail);
            session.beginTransaction();//открываем
            session.save(employee);

            session.getTransaction().commit();//обязательно закрываем, адже если селектим*/
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();//открываем
            Employee employee=session.get(Employee.class,2);
            session.delete(employee);
           // System.out.println(employee.getDetail());

            session.getTransaction().commit();//обязательно закрываем, адже если селектим
        }finally {
            session.close();
            sessionFactory.close();
        }

    }


}
