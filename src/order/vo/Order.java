package order.vo;

import java.util.Date;

public class Order {

	// variable
	private int orderNumber;
	private String orderProduct;
	private int orderQuentity;
	private int sales;
	private int cost;
	private Date salesDate;
	private String orderCustomer;
	private String payment;
	
	
	// constructor
	public Order() {
	
		
		
	}
	
	
	// getter and setter
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(String orderProduct) {
		this.orderProduct = orderProduct;
	}
	public int getOrderQuentity() {
		return orderQuentity;
	}
	public void setOrderQuentity(int orderQuentity) {
		this.orderQuentity = orderQuentity;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}
	public String getOrderCustomer() {
		return orderCustomer;
	}
	public void setOrderCustomer(String orderCustomer) {
		this.orderCustomer = orderCustomer;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
		
}
