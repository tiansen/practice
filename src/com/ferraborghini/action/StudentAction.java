package com.ferraborghini.action;

import java.io.*;
import java.util.*;

import javax.annotation.Resource;
import net.sf.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionContext;
import com.ferraborghini.model.*;
import com.ferraborghini.service.StudentService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;

import lombok.Getter;
import lombok.Setter;

@Controller("studentAction")
@Scope("prototype")
public class StudentAction {
	// 使用Spring的注解，为类的成员变量赋值
	@Setter @Getter
	private List student_list;
	@Setter @Getter
	private List student_all_list;
	@Resource @Setter @Getter
	private StudentService studentService;
	@Setter @Getter
	private String SId;
	@Setter @Getter
	private String selectSId;
	@Setter
	private String someValue;
	@Setter
	private String typeName;
	
	
	public String getAllStudent(){
		student_list = studentService.getAllStudent();
		student_all_list = student_list;
		//ActionContext.getContext().put("student_list", student_list);
		if(student_list.isEmpty()){
			return "ERROR";			
		}
		return "SUCCESS";
	}
	public String updateStudentBySId(){
		int statusOfUpdate = studentService.updateStudentBySId(SId,someValue,typeName);
		if(statusOfUpdate==0){
			return "ERROR";			
		}
		student_list = studentService.getAllStudent();
		return "SUCCESS";
	}
	public String selectStudentBySId(){
		student_all_list = studentService.getAllStudent();
		student_list = studentService.selectStudentBySId(SId);
		selectSId = SId;
		if(student_list.isEmpty()){
			return "ERROR";			
		}
		return "SUCCESS";
	}

}
