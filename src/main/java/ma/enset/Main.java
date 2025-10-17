package ma.enset;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Create Hibernate configuration
        Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml");

        // Create session factory
        SessionFactory sf = cf.buildSessionFactory();

        // Create session
        Session session = sf.openSession();
//
        Transaction transaction = session.beginTransaction();
        Enseignant ens = new Enseignant();
        ens.setId(3);
        ens.setName("khalil");
        ens.setLastName("lastName");
        session.persist(ens);
        transaction.commit();
        session.close();
        sf.close();

    }
}
