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
	@Setter @Getter
	private String selectedSId;
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
		studentService.updateStudentBySId(SId,someValue,typeName);
		student_all_list = studentService.getAllStudent();
		student_list = student_all_list;
		if(selectedSId.equals(SId)){
			selectSId = SId;
			student_list = studentService.selectStudentBySId(SId);
		}
		
//		try {
//			Process proc = Runtime.getRuntime().exec("python  C:\\Users\\TS\\Desktop\\test.py");
//			System.out.println(proc.waitFor());
//			InputStreamReader ir = new InputStreamReader(proc.getInputStream());
//            LineNumberReader input = new LineNumberReader(ir);
//            String line;
//            System.out.println(input);
//            while((line = input.readLine	()) != null)
//                System.out.println(line);
//            input.close();
//            ir.close();
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}  
//		if(statusOfUpdate==0){
//			return "ERROR";			
//		}
		
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
