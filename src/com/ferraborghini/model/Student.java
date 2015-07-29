package com.ferraborghini.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String SId;
	private String SName;
	private String sex;
	private String nation;
	private String nativeplace;
	private String entrancetime;
	private String major;
	private String college;
	private String birthday;
	private String tel;
	private String address;
	private String SPwd;
	private Set scores = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String SName) {
		this.SName = SName;
	}

	/** full constructor */
	public Student(String SName, String sex, String nation, String nativeplace,
			String entrancetime, String major, String college, String birthday,
			String tel, String address, String SPwd, Set scores) {
		this.SName = SName;
		this.sex = sex;
		this.nation = nation;
		this.nativeplace = nativeplace;
		this.entrancetime = entrancetime;
		this.major = major;
		this.college = college;
		this.birthday = birthday;
		this.tel = tel;
		this.address = address;
		this.SPwd = SPwd;
		this.scores = scores;
	}

	// Property accessors

	public String getSId() {
		return this.SId;
	}

	public void setSId(String SId) {
		this.SId = SId;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getNativeplace() {
		return this.nativeplace;
	}

	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	public String getEntrancetime() {
		return this.entrancetime;
	}

	public void setEntrancetime(String entrancetime) {
		this.entrancetime = entrancetime;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSPwd() {
		return this.SPwd;
	}

	public void setSPwd(String SPwd) {
		this.SPwd = SPwd;
	}

	public Set getScores() {
		return this.scores;
	}

	public void setScores(Set scores) {
		this.scores = scores;
	}

}