package in.javahome.onetoone;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;

public class AddPersonAndPassport {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();

		Passport passport = new Passport();
		passport.setPassportNo("500G8001");
		passport.setDoe(new Date());
		passport.setPlaceOfIssue("Hyd");

		Person person = new Person();
		person.setpId(1);
		person.setLocation("Banglore");
		person.setName("Krishna");
		
		
		person.setPassport(passport);

		session.save(passport);
		session.save(person);

		tx.commit();
	}
}
