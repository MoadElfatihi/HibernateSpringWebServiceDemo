import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.instructor.entities.Instructor;
import com.demo.instructor.entities.InstructorDetail;
import com.hibernateTutoriel.entities.Student;

public class InstructorDemo {
	static SessionFactory sessionFactory;
	
	static Session session;
	
	static {
		
		 sessionFactory = new Configuration().configure()
				 .addAnnotatedClass(Instructor.class)
				 .addAnnotatedClass(InstructorDetail.class)
				 .buildSessionFactory();
		
		 session = sessionFactory.getCurrentSession();
		
	}
	public static void main(String[] args) {
		
		try {
			session.beginTransaction();
			
			//
			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 30);
			
			System.out.println(instructorDetail);
			 System.out.println(instructorDetail.getInstructor());
			//
			
			session.getTransaction().commit();
			/*
			 * Instructor instructor = new Instructor("test", "test");
			InstructorDetail instructorDetail = new InstructorDetail("url", "thrialthlon");
			instructor.setInstructorDetail(instructorDetail);
			session.save(instructor);
			
			 *  Instructor instructor = session.get(Instructor.class, 23);
			if(instructor != null) {
				session.delete(instructor);
			}
			 */
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
