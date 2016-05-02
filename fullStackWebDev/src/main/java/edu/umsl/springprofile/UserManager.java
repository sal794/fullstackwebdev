package edu.umsl.springprofile;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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
	public boolean checkLogin(String user, String password){
		boolean login = false;
		Session session = HibernateUtil.buildSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		List usersL = session.createQuery("FROM Users").list();
		for (Iterator iterator = usersL.iterator(); iterator.hasNext();){
			Users use = (Users) iterator.next();
			if (use.getUserName().equals(user)){
				if (use.getPassword().equals(password)){
					login = true;
				} else {
					login = false;
				}
			} else {
				login = false;
			}
		}
		return login;
	}
	
}
