/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yourcompany.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 12-06-2012
 * 
 * XDoclet definition:
 * @struts.form name="editForm"
 */
public class EditForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** username property */
	private String username;

	/** address property */
	private String address;

	/** college property */
	private String college;

	/** telephone property */
	private String telephone;

	/** password property */
	private String password;

	/** studentid property */
	private String studentid;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the username.
	 * @return String
	 */
	public String getUsername() {
		return username;
	}

	/** 
	 * Set the username.
	 * @param username The username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/** 
	 * Returns the address.
	 * @return String
	 */
	public String getAddress() {
		return address;
	}

	/** 
	 * Set the address.
	 * @param address The address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/** 
	 * Returns the college.
	 * @return String
	 */
	public String getCollege() {
		return college;
	}

	/** 
	 * Set the college.
	 * @param college The college to set
	 */
	public void setCollege(String college) {
		this.college = college;
	}

	/** 
	 * Returns the telephone.
	 * @return String
	 */
	public String getTelephone() {
		return telephone;
	}

	/** 
	 * Set the telephone.
	 * @param telephone The telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/** 
	 * Returns the password.
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * Set the password.
	 * @param password The password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** 
	 * Returns the studentid.
	 * @return String
	 */
	public String getStudentid() {
		return studentid;
	}

	/** 
	 * Set the studentid.
	 * @param studentid The studentid to set
	 */
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
}