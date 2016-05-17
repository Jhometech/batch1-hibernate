package in.javahome.onetoone;

import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;

public class FetchPersonAndPassport {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Person person = session.get(Person.class, 1);
	
	System.out.println("Name -> "+person.getName());
	System.out.println("Location-> "+person.getLocation());
	System.out.println("ID ->"+person.getpId());
	
	Passport passport = person.getPassport();
	
	System.out.println("PASSPORT NO ->"+passport.getPassportNo());
	System.out.println("DOE -> "+passport.getDoe());
	System.out.println("POI"+passport.getPlaceOfIssue());
}
}
