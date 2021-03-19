package hibernate_one_to_many_uni;



import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
         /*  session = sessionFactory.getCurrentSession();
            Department dep=new Department("CR",1500,500);
            Employee emp1=new Employee("Oleg","Ivanov",800);
            Employee emp2=new Employee("Andret","Sidorov",1000);
            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);

            session.beginTransaction();//открываем
            session.save(dep);
            session.getTransaction().commit();*///обязательно закрываем, адже если селектим*/
           /* session = sessionFactory.getCurrentSession();
            session.beginTransaction();//открываем
            Department department=session.get(Department.class,3);
            System.out.println(department);
            System.out.println(department.getEmps());
            session.getTransaction().commit();*/
           session = sessionFactory.getCurrentSession();
            session.beginTransaction();//открываем
            Department department=session.get(Department.class,2);
          //  Employee employee=session.get(Employee.class,3);
            session.delete(department);
            session.getTransaction().commit();


        } finally {
            session.close();
            sessionFactory.close();
        }

    }


}
