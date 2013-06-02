import org.hibernate.Transaction;

import hibernatedao.Bbsuser;
import hibernatedao.BbsuserDAO;

/**
 * 
 */

/**
 * @author think
 *
 */
public class BbsUserDAOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bbsuser user  = new Bbsuser();
		user.setUsername("user1");
		user.setPassword("123456");
		user.setAge(21);
		
		BbsuserDAO dao = new BbsuserDAO();
		
		Transaction tran = dao.getSession().beginTransaction();
		
		dao.save(user);
		tran.commit();
	}

}
