package com.example.login_page;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionToDB {

    private static SessionFactory sessionFactory(){
        SessionFactory sf = null;
        try {
            Configuration cfg = new Configuration();
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
            cfg.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:xe");
            cfg.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
            cfg.setProperty("hibernate.connection.username", "mani");
            cfg.setProperty("hibernate.connection.password", "123");
            sf = cfg.addAnnotatedClass(Users.class).buildSessionFactory();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sf;
    }
    public static Integer Check(String username, String password){
        int a = 0;
        try{
            Session session = sessionFactory().openSession();
            Users ob = session.load(Users.class,username);
            if (ob.getUsername().equals(username) && ob.getPassword().equals(password)) {
                a++;
            }
            sessionFactory().close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return a;
    }

    public static Integer Add_User(String email,String username,String password){
        int a=-1;
        try {
            Session session = sessionFactory().openSession();
            Users ob = session.get(Users.class,username);
            Session session1 = sessionFactory().openSession();
            Users ob1 = session1.get(Users.class,email);
            if (ob != null || ob1 != null){
                sessionFactory().close();
            }
            else {
                Session session2 = sessionFactory().openSession();
                session2.beginTransaction();
                session2.save(new Users(email,username,password));
                session2.getTransaction().commit();
                a = 1;
                sessionFactory().close();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return a;
    }

    public static Users Find_User(String email, String username){
        Users ob = null;
        try{
            Session session = sessionFactory().openSession();
            ob = session.get(Users.class,username);
            sessionFactory().close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return ob;
    }

    public static Integer ChangePass(String email, String username, String password){
        int a = 1;
        try {
            Session session = sessionFactory().openSession();
            Users ob = session.get(Users.class,username);
            ob.setPassword(password);
            session.beginTransaction();
            session.update(ob);
            session.getTransaction().commit();
            sessionFactory().close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return a;
    }
}
