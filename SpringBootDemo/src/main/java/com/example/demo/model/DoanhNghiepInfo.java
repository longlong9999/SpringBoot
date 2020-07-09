package com.example.demo.model;

public class DoanhNghiepInfo {
	private Long id;
	private String Name;
	private int Price;
	private int Quantity;
	private int Total;
	private boolean Status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	  public DoanhNghiepInfo() {}  
	public DoanhNghiepInfo(Long id, String name, int price, int quantity, int total, boolean status) {
		super();
		this.id = id;
		Name = name;
		Price = price;
		Quantity = quantity;
		Total = total;
		Status = status;
	}
	
	
	

}
