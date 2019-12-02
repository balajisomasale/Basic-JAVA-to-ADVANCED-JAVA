package springJDBC;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class OneToOne {

	public static void main(String[] args) {

		kid k = new kid();

		k.setMarks(777);
		k.setName("Balu");
		k.setRollno(234);
//		
//		
		
		kid k1 = new kid();

		k1.setMarks(888);
		k1.setName("cret");
		k1.setRollno(567);
//		
		
		laptop lt =new laptop();
		lt.setLid(1);
		lt.setLname("Onepldsfb");
		
		
		laptop lt1 =new laptop();
		lt1.setLid(2);
		lt1.setLname("lenovo");
		
		//k.set(lt);
		
		k.getLap().add(lt);
		k1.getLap().add(lt1);
		
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(kid.class).addAnnotatedClass(laptop.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
////		
		session.save(k);
		session.save(k1);
		session.save(lt);
		session.save(lt1);
//		
//		
		String hql = "FROM laptop";
		Query query = session.createQuery(hql);
		List<laptop> results = query.list();
//		int results=(Integer) query.uniqueResult();
//		System.out.println(results);
		Query query1 =session.createQuery("From kid");
		List<kid> results1 = query1.list();
		for(laptop l:results)
		{
			System.out.println(l);
		}
		for(kid l1:results1)
		{
			System.out.println(l1);
		}
		
		
		
		tx.commit();
		
		session.close();

	}

}
