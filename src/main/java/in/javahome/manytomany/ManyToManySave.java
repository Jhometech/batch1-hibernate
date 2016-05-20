package in.javahome.manytomany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;

public class ManyToManySave {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Author a1 = new Author();
		a1.setAuthorId(222);
		a1.setEmail("kathy@java.in");
		a1.setName("Kathy, Sierra");
		
		Book b1 = new Book();
		b1.setBookId(444);
		b1.setBookName("Hadoop");
		b1.setCost(750);
		
		Book b2 = new Book();
		b2.setBookId(555);
		b2.setBookName("Scala");
		b2.setCost(750);
		
		a1.getBooks().add(b1);
		a1.getBooks().add(b2);
		b2.getAuthors().add(a1);
		b1.getAuthors().add(a1);
		session.save(a1);
		tx.commit();
		session.close();
	}
}
