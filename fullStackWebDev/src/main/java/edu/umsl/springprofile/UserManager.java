package edu.umsl.springprofile;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserManager {

	public void addUser(String user, String password, String name ){
		Session session = HibernateUtil.buildSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		Users use = new Users();
		use.setUserName(user);
		use.setPassword(password);
		use.setRealName(name);
		session.save(use);
		tx.commit();
		session.close();
	}
	
}
