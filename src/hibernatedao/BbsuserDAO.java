package hibernatedao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Bbsuser entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see hibernatedao.Bbsuser
 * @author MyEclipse Persistence Tools
 */

public class BbsuserDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(BbsuserDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String AGE = "age";

	public void save(Bbsuser transientInstance) {
		log.debug("saving Bbsuser instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Bbsuser persistentInstance) {
		log.debug("deleting Bbsuser instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Bbsuser findById(java.lang.Integer id) {
		log.debug("getting Bbsuser instance with id: " + id);
		try {
			Bbsuser instance = (Bbsuser) getSession().get(
					"hibernatedao.Bbsuser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Bbsuser instance) {
		log.debug("finding Bbsuser instance by example");
		try {
			List results = getSession().createCriteria("hibernatedao.Bbsuser")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Bbsuser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Bbsuser as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByAge(Object age) {
		return findByProperty(AGE, age);
	}

	public List findAll() {
		log.debug("finding all Bbsuser instances");
		try {
			String queryString = "from Bbsuser";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Bbsuser merge(Bbsuser detachedInstance) {
		log.debug("merging Bbsuser instance");
		try {
			Bbsuser result = (Bbsuser) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Bbsuser instance) {
		log.debug("attaching dirty Bbsuser instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Bbsuser instance) {
		log.debug("attaching clean Bbsuser instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public Bbsuser CheckLogin(String username,String password){
		java.util.List results = findByUsername(username);
		if(results != null && results.size()>0){
			Bbsuser user = (Bbsuser)results.get(0);
			if(user.getPassword().equals(password)){
				return user;
			}
		}
		
		return null;
	}
}