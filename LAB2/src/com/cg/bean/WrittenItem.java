package com.cg.bean;

public class WrittenItem extends Item{
	private String author;
	public WrittenItem(int iid, int copies, String title ) {
		super(iid, copies, title);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return super.toString()+ " WrittenItem [author=" + author + "]";
	}
	
}
