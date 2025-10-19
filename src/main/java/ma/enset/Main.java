package ma.enset;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.TransactionSettings;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       Configuration configuration = new Configuration();
       configuration.configure("hibernate.cfg.xml");
       SessionFactory sessionFactory = configuration.buildSessionFactory();
       Session session = sessionFactory.openSession();
       Transaction transaction = session.beginTransaction();

       Enseignant ens = new Enseignant();
       ens.setId(1);
       ens.setName("omar");
       ens.setLastName("khabou");
       session.persist(ens);

       Enseignant ens1 = session.find(Enseignant.class, 1);
       System.out.println(ens1);

       Student student = session.find(Student.class, 2);
       System.out.println(student);
       Student student1 = session.find(Student.class, 2);
       System.out.println(student1);

       transaction.commit();
       session.close();

       // dexieme session
       Session session2 = sessionFactory.openSession();
       Student student2 = session2.find(Student.class, 2);
       System.out.println(student2);
       Enseignant ens2 = session2.find(Enseignant.class, 1);
       System.out.println(ens2);

       sessionFactory.close();


    }
}
