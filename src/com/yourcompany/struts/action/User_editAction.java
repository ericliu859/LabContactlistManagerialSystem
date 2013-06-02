/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yourcompany.struts.action;

import hibernatedao.Bbsuser;
import hibernatedao.BbsuserDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 12-01-2012
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 * @struts.action-forward name="go_edit" path="/form/register.jsp"
 */
public class User_editAction extends Action {
	/*
	 * Generated Methods
	 */
	private BbsuserDAO dao;
	
	public User_editAction(){
		setDao(new BbsuserDAO());
	}
	
	public BbsuserDAO getDao() {
		return dao;
	}

	public void setDao(BbsuserDAO dao) {
		this.dao = dao;
	}

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String n_id = request.getParameter("userid");
		BbsuserDAO dao = getDao();
		Bbsuser user = dao.findById(Integer.parseInt(n_id));
		try{
			if(user!=null){
				System.out.println("change userid:"+n_id);
				request.getSession().setAttribute("s_user", user);
				return mapping.findForward("go_edit");
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return null;
	}
}