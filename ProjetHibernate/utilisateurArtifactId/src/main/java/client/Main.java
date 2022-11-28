package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.User;
import util.HibernateUtil;

public class Main {
	public static void ajouterUser(User user, Session session) {
		Transaction trx = session.beginTransaction();
		try {
			User utilisateur = user;
			session.save(utilisateur);
			trx.commit();
		} catch (Exception e) {
			trx.rollback();
		}
	}
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionfactory().openSession();

		User utilisateur = new User("Trenet", "Charles", 87);
		ajouterUser(utilisateur, session);
	}

}
