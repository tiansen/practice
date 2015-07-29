package com.ferraborghini.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ferraborghini.model.Student;;


/**
 * 
 * 
 * @author lipeng
 * 
 */
@Repository("baseDao")
public class BaseDao{
	@Resource
	public HibernateTemplate hibernateTemplate;
	public SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	/**
	 * 
	 * 返回所有学生
	 * @param hql
	 *            
	 * @param values
	 *            
	 * @return List
	 */
	public List getAllStudent(String hql){
		System.out.println("dao");
		List stu_list= this.hibernateTemplate.find(hql);
		System.out.println("over");
		return stu_list;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
