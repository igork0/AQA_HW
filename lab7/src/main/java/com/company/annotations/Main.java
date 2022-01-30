package com.company.annotations;

import com.company.annotations.model.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("Lviv");
        address.setCounty("Ukrainian");
        address.setStreet("Naukova");
        address.setBuilding_number(13);
        SessionFactory sessionFactory = null;
        try {
            //Get Session
            sessionFactory = new HibernateUtil().getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            //start transaction
            session.beginTransaction();
            //Save the Model object

            System.out.println("address ID=" + session.save(address));

            //Commit transaction
            session.getTransaction().commit();
            //terminate session factory, otherwise program won't end
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }

    }
}
