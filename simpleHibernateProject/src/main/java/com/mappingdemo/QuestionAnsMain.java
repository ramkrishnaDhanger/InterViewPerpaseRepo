package com.mappingdemo;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionAnsMain {

	public static void main(String[] args) {
		System.out.println("QuestionAnsMain");
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		/*
		 * we Are Creating the Object of Question Class
		 * 
		 * */
		QuestionDemo qus= new QuestionDemo();
		QuestionDemo qus1= new QuestionDemo();
		Answer ans1=new Answer();
		Answer ans2=new Answer();
		Answer ans3=new Answer();
		Answer ans4=new Answer();
		Answer ans5=new Answer();
		Answer ans6=new Answer();
		ans1.setAnswer("java is object oriented Language");
		ans2.setAnswer("Hibernate is object oriented Language");
		ans3.setAnswer("Hibernate2 is object oriented Language");
		ans4.setAnswer("java 1 is object oriented Language");
		ans5.setAnswer("Hibernate 1is object oriented Language");
		ans6.setAnswer("java 2 is object oriented Language");
		
		List<Answer> list =new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans4);
		list.add(ans6);
		
		List<Answer> list1 =new ArrayList<Answer>();
		list1.add(ans2);
		list1.add(ans3);
		list1.add(ans5);
		
	
		qus.setQuestion("what is Java ?");
		//qus.setAnswer(list);
		qus1.setQuestion("what is Hibernate  ?");
		//qus1.setAnswer(list1);
		
		
		
		session.save(qus);
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);
		session.save(ans4);
		session.save(ans5);
		session.save(ans6);
		session.save(qus1);
		
		QuestionDemo getquestion=	session.get(QuestionDemo.class, 1);
		System.out.println(getquestion.getQuestion());
		
		
		
		tx.commit();
		session.close();
		
		

	}

}
