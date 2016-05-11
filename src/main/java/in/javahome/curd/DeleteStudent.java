package in.javahome.curd;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class DeleteStudent {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student Id to delete");
		int id = in.nextInt();
		try (Session session = HibUtil.getSession()) {
			Student std = session.get(Student.class, id);
			Transaction tx = session.beginTransaction();
			session.delete(std);
			tx.commit();
		}
	}
}
