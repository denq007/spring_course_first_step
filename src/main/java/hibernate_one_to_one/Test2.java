package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session=null;
        try {
          /*  session = sessionFactory.getCurrentSession();
            Employee employee=new Employee("Nikolay","Ivanov","HR",750);
            Detail detail=new Detail("New-York","4754666589","nikoly@gmail.com");

            employee.setEmpdetail(detail);
            detail.setEmployee(employee);
            session.beginTransaction();//открываем
            session.save(detail);
            session.getTransaction().commit();*///обязательно закрываем, адже если селектим*/
           // System.out.println(employee.getDetail());
         /*   session = sessionFactory.getCurrentSession();

            session.beginTransaction();//открываем
            Detail detail=session.get(Detail.class,4);
            System.out.println(detail.getEmployee());

            session.getTransaction().commit();*/
            session = sessionFactory.getCurrentSession();

            session.beginTransaction();//открываем
            Detail detail=session.get(Detail.class,1);
            detail.getEmployee().setEmpdetail(null);
            session.delete(detail);

            session.getTransaction().commit();//обязательно закрываем, адже если селектим*/



        }finally {
            session.close();
            sessionFactory.close();
        }

    }


}
