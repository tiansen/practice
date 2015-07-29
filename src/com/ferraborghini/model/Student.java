package com.ferraborghini.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student{

	// Fields
    @Getter @Setter
	private String SId;
    @Getter @Setter
	private String SName;
    @Getter @Setter
	private String sex;
    @Getter @Setter
	private String nation;
    @Getter @Setter
	private String nativeplace;
    @Getter @Setter
	private String entrancetime;
    @Getter @Setter
	private String major;
    @Getter @Setter
	private String college;
    @Getter @Setter
	private String birthday;
    @Getter @Setter
	private String tel;
    @Getter @Setter
	private String address;
    @Getter @Setter
	private String SPwd;

}