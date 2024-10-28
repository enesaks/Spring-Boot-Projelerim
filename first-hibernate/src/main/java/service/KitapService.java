package service;

import model.Kitap;
import model.Yazar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtil;

public class KitapService {
    private static SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
    private static Session session=sessionFactory.openSession();


    public static void create(Kitap kitap) {
        session.beginTransaction();
        session.persist(kitap);
        session.getTransaction().commit();
        session.close();
    }

    public Kitap getById(int id) {
        Kitap k=(Kitap)session.get(Kitap.class, id);
        return k;
    }

    public static void update(Kitap kitap) {
        session.beginTransaction();
        session.merge(kitap);
        session.getTransaction().commit();

    }
}
