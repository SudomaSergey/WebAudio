package controllers;

import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import dom.Song;


public class DatabaseController {
	
	public static ArrayList<Song> getAllSongs(){
		String hql = "from Song";
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery(hql);		
		ArrayList<Song> resultsList = (ArrayList<Song>) query.list();
		session.close();		
		return resultsList;		
	}
	
	public static void pushToDB(Object object){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(object);
		session.getTransaction().commit();
		session.close();
	}


}
