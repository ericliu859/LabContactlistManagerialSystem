package hibernatedao;

import sun.security.util.BigInt;

/**
 * AbstractBbsuser entity provides the base persistence definition of the
 * Bbsuser entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBbsuser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private Integer age;
	private String telephone;
	private String studentid;
	private String address;
	private String college;

	// Constructors

	/** default constructor */
	public AbstractBbsuser() {
	}

	/** minimal constructor */
	public AbstractBbsuser(Integer age) {
		this.age = age;
	}

	/** full constructor */
	public AbstractBbsuser(String username, String password, Integer age) {
		this.username = username;
		this.password = password;
		this.age = age;
	}

	// Property accessors

	public AbstractBbsuser(String username, String password, Integer age,String telephone) {
		this.username = username;
		this.password = password;
		this.age = age;
		this.setTelephone(telephone);
		// TODO Auto-generated constructor stub
	}
	
	public AbstractBbsuser(String username, String password, Integer age,String telephone,String studentid,String address,String college) {
		this.username = username;
		this.password = password;
		this.age = age;
		this.setTelephone(telephone);
		this.setStudentid(studentid);
		this.setAddress(address);
		this.setCollege(college);
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCollege() {
		return college;
	}
}