package service;

import model.Yazar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtil;

public class YazarService {
    private static SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
    private static Session session=sessionFactory.openSession();


    public static void create(Yazar yazar) {
        session.beginTransaction();
        session.persist(yazar);
        session.getTransaction().commit();
        session.close();
    }

    public static Yazar getById(int id) {
        session.beginTransaction();
        Yazar yazar = (Yazar) session.get(Yazar.class, id);
        session.getTransaction().commit();
        return yazar;
    }
}
