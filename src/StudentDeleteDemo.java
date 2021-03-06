import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateTutoriel.entities.Student;

public class StudentDeleteDemo {

	
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
											.configure()
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			Student student1 = new Student("student1", "student1", "student1@gmail.com");

			Student student2 = new Student("student2", "student2", "student2@gmail.com");
			
			Student student3 = new Student("student3", "student3", "student3@gmail.com");
			
			session.save(student1);
			session.save(student2);
			session.save(student3);
			
			Student student = session.get(Student.class, 1);
			session.delete(student);
			
			//session.createQuery("delete from Student s where s.id=2").executeUpdate();
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
}
