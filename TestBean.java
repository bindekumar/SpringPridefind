package com.binde.spring;

import java.util.Date;

public class TestBean implements Test {
    private Date date;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void display() {
	System.out.println(date);	
	}
}
