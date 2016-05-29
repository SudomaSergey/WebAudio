package controllers;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import dom.Publisher;
import dom.Song;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
    public static synchronized SessionFactory getSessionFactory() {
        if (sessionFactory == null) {

            Configuration config = new Configuration();            
    		config.addAnnotatedClass(Song.class);
    		config.addAnnotatedClass(Publisher.class);
    		config.configure();
            
            ServiceRegistry serviceRegistry
                = new StandardServiceRegistryBuilder()
                    .applySettings(config.getProperties()).build();

            sessionFactory = config.buildSessionFactory(serviceRegistry);           
        }         
        return sessionFactory;
    }

}
