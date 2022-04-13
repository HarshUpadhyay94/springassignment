package in.co.rays.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.rays.DTO.CollegeDTO;
@Repository
public class CollegeModelTest {

	public static void main(String[] args) {
		
		testUpdate(0, null, null);
	}

	private static int testUpdate(int id, String name, String state) 
	{
		SessionFactory sessionFactory = null;
	         Session session = sessionFactory.openSession();
	         Query query = session.createQuery("update collegedto set name=?, state=? where Id=? ");
	         query.setString(1, "Vindhyanchal Institute");
	         query.setString(2, "Maharastra");
	         int result = query.executeUpdate();
	         return result;
	       
	}	
	
}
