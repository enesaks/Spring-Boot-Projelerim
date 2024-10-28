package utils;


import model.Kitap;
import model.YayinEvi;
import model.Yazar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionFactory = getInstanceSessionFactory();

    private static SessionFactory getInstanceSessionFactory() {
        Configuration cfg = new Configuration();
        try {

            cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/kutuphane");
            cfg.setProperty("hibernate.connection.username", "root");
            cfg.setProperty("hibernate.connection.password", "1234");
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            cfg.setProperty("hibernate.show_sql", "true");
            cfg.setProperty("hibernate.hbm2ddl.auto", "none");
            cfg.addAnnotatedClass(Yazar.class);
            cfg.addAnnotatedClass(Kitap.class);
            cfg.addAnnotatedClass(YayinEvi.class);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cfg.buildSessionFactory();

    }


    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        sessionFactory.close();
    }
}
