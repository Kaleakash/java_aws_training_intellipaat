package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import javax.persistence.Table;
@Entity
@Table(name="TRAINER")
public class Trainer {
@Id
private int tid;
@Column(name="tname")
private String name;
private String tech;
@OneToMany
@JoinColumn(name = "tsid",referencedColumnName = "tid")
private List<Student> listOfStd;

public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public List<Student> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Student> listOfStd) {
	this.listOfStd = listOfStd;
}
@Override
public String toString() {
	return "Trainer [tid=" + tid + ", name=" + name + ", tech=" + tech + ", listOfStd=" + listOfStd + "]";
}

}
