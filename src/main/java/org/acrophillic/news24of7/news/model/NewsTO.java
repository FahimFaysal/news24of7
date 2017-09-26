package org.acrophillic.news24of7.news.model;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//@Jason
public class NewsTO {

	private int id;
	private String title;
	private String news;
	private int auther;
	private Calendar date;

	public NewsTO() {

	}


	public NewsTO(int id, String title, String news, int auther, Calendar date) {
		super();
		this.id = id;
		this.title = title;
		this.news = news;
		this.auther = auther;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public int getAuther() {
		return auther;
	}

	public void setAuther(int auther) {
		this.auther = auther;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
