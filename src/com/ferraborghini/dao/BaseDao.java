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
		List stu_list= this.hibernateTemplate.find(hql);
		return stu_list;
	}
	/**
	 * 
	 * 更新学生
	 * @param hql
	 *            
	 * @param values
	 *            
	 * @return List
	 */
	public int updateStudentBySId(String hql,String someValue,String typeName){
		List stu_list= this.hibernateTemplate.find(hql);
		Student stu = (Student)stu_list.get(0);
		if ("SName".equals(typeName)) {
			stu.setSName(someValue);
		} else if("nation".equals(typeName)){
			stu.setNation(someValue);
		}
		try {
			this.hibernateTemplate.saveOrUpdate(stu);
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
