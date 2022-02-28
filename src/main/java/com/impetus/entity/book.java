package com.impetus.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class book {
	@Id
	private Integer bookId;
	private String bookName;
	private String authorName;
	private Integer quantity;
	private String subject;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public book(Integer bookId, String bookName, String authorName, Integer quantity, String subject) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.quantity = quantity;
		this.subject = subject;
	}
	
	
}
