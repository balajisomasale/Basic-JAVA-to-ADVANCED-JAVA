package springJDBC;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

     public static void main (String[] args){
           
           Person p = new Person();
           
           student st =new student();
           
           st.setFirstName("tik");
           st.setLastName("tok");
           
  
           
           p.setStu(st);
           
           
           p.setId(34345);
           p.setSalary(1000000);
           
           Configuration con= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
           SessionFactory sf = con.buildSessionFactory();
           Session session= sf.openSession();
           Transaction tx = session.beginTransaction();
           session.save(p);
           tx.commit();
           session.close();
           
                     
     }

}
