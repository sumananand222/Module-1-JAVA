package com.cg.bean;

public class Order {
	private int id;
	private double price;
	private int quantity;
	private double amount;
	private double charges;
	
	public Order(int id, double price, int qty){
		this.id=id;
		this.price=price;
		this.quantity=qty;
		this.charges=75*price*quantity*1.25/100;
		this.amount=price*quantity*75+charges;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", quantity=" + quantity + ", amount=" + amount + ", charges="
				+ charges + "]";
	}
	
}
