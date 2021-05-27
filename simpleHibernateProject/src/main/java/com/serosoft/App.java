package com.serosoft;

import java.io.IOException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Ramkrishna Yadav for Testing perpose creating Demo 
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        /*System.out.println( "Hello World!" );
        SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     Session session=   factory.openSession();
        StudentDemo student= new StudentDemo();
      // student.setId(6L);
        student.setName("gajju yadav");
        student.setEmail("vijay@gmail.com");
        System.out.println( "Student Details"+student.toString());
        
        *//****************Create Another Object for Address ***//*
     AddressDemo address = new AddressDemo();
     FileInputStream image= new FileInputStream("C:\\Users\\serosoft\\Pictures\\Screenshots/791762.jpg");
     byte[] data = new byte[image.available()];
     image.read(data);
     address.setImage(data);
     address.setStreet("testing");
     
     address.setCity("kahrgone");
     address.setCountry("India");
     address.setIsopen(true);
     address.setAddDate(new Date());
       Transaction tx= session.beginTransaction();
        
       
        *//*******
         * Save The Embeded Object Using Hibernate 
         * *******//*
        
       
       StudentDemo student1= new StudentDemo();
       StudentSubject subject = new StudentSubject();
       subject.setSubjectName("java");
       subject.setSubjectDuration("3 month");
      student1.setName("gajju yadav");
         student1.setEmail("vijay@gmail.com");
         student1.setSubject(subject);
         System.out.println( "Student Details"+student1.toString());
       
       session.save(address);
       session.save(student1);
       tx.commit();
      
       session.close();*/
    	
    	
    	System.out.print("Starter........");
    	
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session=factory.openSession();
    Transaction tx=	session.beginTransaction();
    StudentDemo student= new StudentDemo();
    // student.setId(6L);
      student.setName("gajju yadav");
      student.setEmail("vijay@gmail.com");
    String hql = "FROM StudentDemo where email='ram@gmail.com'";
     Query query = session.createQuery(hql);
    List<StudentDemo> results = query.list();
   // session.save(student);
    for(StudentDemo student1:results) {
    	System.out.println("Name Of Student:"+student1.getName() +" Name of Subject :"+ student1.getSubject().getSubjectName());
    }
    
    
    
    tx.commit();
    	session.close();
    	
    	
    }
}
