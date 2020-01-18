import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateTutoriel.entities.Student;

public class QueryStudent {
	static SessionFactory sessionFactory;
	
	static Session session;
	
	static {
		
		 sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		
		 session = sessionFactory.getCurrentSession();
		
	}
	public static void main(String[] args) {
		
		try {
			session.beginTransaction();
			Student student1 = new Student("student1", "student1", "student1@gmail.com");

			Student student2 = new Student("student2", "student2", "student2@gmail.com");
			
			Student student3 = new Student("student3", "student3", "student3@gmail.com");
			
			session.save(student1);
			session.save(student2);
			session.save(student3);
			List<Student> students = session.createQuery("from Student s where s.firstName = 'student1'").getResultList();
			List<Student> student_gmail = session.createQuery("from Student s where s.firstName like '%1%' or s.email like '%gmail.com%'").getResultList();
			System.out.println("############### student OR Condition ###########################");
			System.out.println(student_gmail);
			session.getTransaction().commit();
			System.out.println(students);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
