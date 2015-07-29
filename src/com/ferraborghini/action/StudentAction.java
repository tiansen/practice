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
	@Resource @Setter @Getter
	private StudentService studentService;
	public String getAllStudent(){
		System.out.println("ok");
		List student_list = studentService.getAllStudent();
		ActionContext.getContext().put("student_list", student_list);
		if(student_list.isEmpty()){
			System.out.println("ERROR");
			return "ERROR";			
		}
		System.out.println("SUCCESS"+student_list.size());
		return "SUCCESS";
	}


}
