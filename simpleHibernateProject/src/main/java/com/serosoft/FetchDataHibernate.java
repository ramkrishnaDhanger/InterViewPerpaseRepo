package com.serosoft;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDataHibernate {

	public static void main(String[] args) {
		SessionFactory session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session st=session.openSession();
		Transaction tx= st.beginTransaction();
		StudentDemo student=st.get(StudentDemo.class, 2L);
		System.out.println(student.getName()+ " "+student.getEmail());
		AddressDemo adderess= st.load(AddressDemo.class, 4L);
		System.out.print(adderess.getCity()+" "+adderess.getCountry()+" "+adderess.getStreet()+" "+adderess.getIsopen());
		tx.commit();
		st.close();

	}

}
