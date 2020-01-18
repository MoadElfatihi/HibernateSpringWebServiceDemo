import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateTutoriel.entities.Student;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
											.configure()
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Student student1 = new Student("student1", "student1", "student1@gmail.com");

		Student student2 = new Student("student2", "student2", "student2@gmail.com");
		
		Student student3 = new Student("student3", "student3", "student3@gmail.com");
		
		session.beginTransaction();

		session.save(student1);
		session.save(student2);
		session.save(student3);

			
		Student student = session.get(Student.class,1);
		
		System.out.println(student.getEmail());
		
		session.getTransaction().commit();
	}
}
