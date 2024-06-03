package com.example.check.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CheckModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int regNo;
    @JsonProperty("Employee")
    private String stuName;
    @JsonIgnore
    private String marks;

    
    public CheckModel(){

    }


    public CheckModel(int regNo, String stuName, String marks) {
        this.regNo = regNo;
        this.stuName = stuName;
        this.marks = marks;
    }
    public int getRegNo() {
        return regNo;
    }
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public String getMarks() {
        return marks;
    }
    public void setMarks(String marks) {
        this.marks = marks;
    }
    
}
