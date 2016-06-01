package in.javahome.inheritancemapping;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;

public class CashPaymentDemo {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		Payment p1 = new Payment();
		p1.setAmount(40000.0);
		session.save(p1);
		
		DDPayment p2 = new DDPayment();
		p2.setAmount(60000.0);
		p2.setDdNumber(3456);
		session.save(p2);
		
		CardPayment p3 = new CardPayment();
		p3.setAmount(80000.0);
		p3.setCardNo("6666-8888-9999-7654");
		p3.setCvv(556);
		p3.setCardType("VISA");
		session.save(p3);
		
		tx.commit();
	}
}
