package com.school.app.models;

import java.util.Date;

public class Book {
	private int id;
	private String title;
	private String author;
	private Date date;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date=date;
	}
	
	public Book(int id , String title, String author, Date date) {
		this.id=id;
		this.title=title;
		this.author=author;
		this.date=date;
	}
	public Book() {
		
	}
	@Override 
	public String toString() {
		return "ID : " + id + "\n Title :" + title + "\n Author :" + author + "Date : " + date;
	}
}

