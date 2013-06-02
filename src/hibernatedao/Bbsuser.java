package hibernatedao;

/**
 * Bbsuser entity. @author MyEclipse Persistence Tools
 */
public class Bbsuser extends AbstractBbsuser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Bbsuser() {
	}

	/** minimal constructor */
	public Bbsuser(Integer age) {
		super(age);
	}

	/** full constructor */
	public Bbsuser(String username, String password, Integer age) {
		super(username, password, age);
	}
	
	public Bbsuser(String username, String password, Integer age,String telephone) {
		super(username, password, age,telephone);
	}
	public Bbsuser(String username, String password, Integer age,String telephone,String studentid,String address,String college) {
		super(username, password, age,telephone,studentid,address,college);
	}
}
