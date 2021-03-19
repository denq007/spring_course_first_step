package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
 /*           session = sessionFactory.getCurrentSession();
            Department dep=new Department("Sales",1500,800);
            Employee emp1=new Employee("Zaur","Tregulov",800);
            Employee emp2=new Employee("Elena","Smirnova",1500);
            Employee emp3=new Employee("Anton","Sidorov",1200);
            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
            dep.addEmployeeToDepartment(emp3);

            session.beginTransaction();//открываем
            session.save(dep);
            session.getTransaction().commit();*/ //обязательно закрываем, адже если селектим*/

           session = sessionFactory.getCurrentSession();
            session.beginTransaction();//открываем
            Department department=session.get(Department.class,4);
            System.out.println(department);
            System.out.println(department.getEmps());
            session.getTransaction().commit();

    /*       session = sessionFactory.getCurrentSession();
            session.beginTransaction();//открываем
            Employee employee=session.get(Employee.class,3);
            session.delete(employee);
            session.getTransaction().commit();*/


        } finally {
            session.close();
            sessionFactory.close();
        }

    }


}
