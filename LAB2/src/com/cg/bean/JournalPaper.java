package com.cg.bean;

public class JournalPaper extends WrittenItem {
	private int yrOfPubl;
	public JournalPaper(int iid, int copies, String title, int yrOfPubl ) {
		super(iid, copies, title);
		this.yrOfPubl= yrOfPubl;
	}
	public int getYrOfPubl() {
		return yrOfPubl;
	}
	public void setYrOfPubl(int yrOfPubl) {
		this.yrOfPubl = yrOfPubl;
	}
	@Override
	public String toString() {
		return super.toString()+" JournalPaper [yrOfPubl=" + yrOfPubl + "]";
	}
	
}
