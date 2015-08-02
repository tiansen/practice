package com.ferraborghini.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ferraborghini.model.*;
import com.ferraborghini.dao.BaseDao;

@Service("userService")//创建一个实例userService
@Transactional//事务管理
public class StudentService {
	//给UserService注入BaseDao
	@Resource
	private BaseDao baseDao;
	
	/**
	 * 查询所有数据
	 * @param name
	 * @param pass
	 * @return
	 */
	//方法的注释,查询不需要启动事务，所以用NOT_SUPPORTED
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly = true)
	public List getAllStudent(){
		String hql="from Student";
		List list = this.baseDao.getAllStudent(hql);
		return list;
	}
	/**
	 * 更新修改后的数据
	 * @param name
	 * @param pass
	 * @return
	 */
	public int updateStudentBySId(String SId,String someValue,String typeName){
		String hql="from Student where SId ='"+SId+"'";
		int statusOfUpdate = this.baseDao.updateStudentBySId(hql,someValue,typeName);
		return statusOfUpdate;
	}
	/**
	 * 更新修改后的数据
	 * @param name
	 * @param pass
	 * @return
	 */
	public List selectStudentBySId(String SId){
		String hql="from Student where SId ='"+SId+"'";
		List list = this.baseDao.getAllStudent(hql);
		return list;
	}
}
