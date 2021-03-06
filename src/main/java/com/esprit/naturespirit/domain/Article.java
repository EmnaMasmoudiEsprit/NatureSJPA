package com.esprit.naturespirit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Article {
	private int id ; 
	private String title ; 
	private String content ;
	private SimpleUser simple;
	
	
	
	public Article() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@ManyToOne
	public SimpleUser getSimple() {
		return simple;
	}

	public void setSimple(SimpleUser simple) {
		this.simple = simple;
	} 
	
	
	
	

}
