package com.itbank.model;

import java.sql.Date;

import org.springframework.stereotype.Service;

/*
테이블 정보 

IDX      NOT NULL NUMBER       
TITLE    NOT NULL VARCHAR2(20) 
CONTENTS NOT NULL CLOB         
WRITER   NOT NULL VARCHAR2(20) 
VCOUNT            NUMBER       
WDATE             DATE  

 */

public class BoardVO {
	private String title;
	private String contents;
	private String writer;
	private int idx,vcount;
	private Date wdate;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getVcount() {
		return vcount;
	}
	public void setVcount(int vcount) {
		this.vcount = vcount;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	
	
	
}
