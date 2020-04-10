package model;

import java.io.Serializable;

import java.util.LinkedHashMap;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name = "pizza")
@SessionScoped

public class Pizza implements Serializable{
	private static final long serialVersionUID = 1L;
	  Map<String,Double> crust_cost;
	  Map<String,Double> toppings_cost;
	  Map<String,Double> size_cost;
	  Map<String,Object> crust;	
	  Map<String,Object> delivery;	
	String[] toppings;
	 Map<String,Object> size;
		 
	 
	 
	 
	 public Map<String, Object> getDelivery() {
		return delivery;
	}
	public void setDelivery(Map<String, Object> delivery) {
		this.delivery = new LinkedHashMap<String, Object>();        
		this.delivery.put("Delivery at home", "Delivery at home"); 
		this.delivery.put("Delivery to neighbour", "Delivery to neighbour");
	}
	 public Map<String, Double> getCrust_cost() {
		return crust_cost;
	}
	public void setCrust_cost(Map<String, Double> crust_cost) {
		this.crust_cost =new LinkedHashMap<String,Double>();
		this.crust_cost.put("whole wheat flour", 30.0); 
		this.crust_cost.put("pita bread", 20.0);
		this.crust_cost.put("thin sanwich bread", 15.0);
	}
	public Map<String, Double> getToppings_cost() {
		return toppings_cost;
	}
	public void setToppings_cost(Map<String, Double> toppings_cost) {
		this.toppings_cost=new LinkedHashMap<String,Double>();
		this.toppings_cost.put("mushrooms", 30.0); 
		this.toppings_cost.put("paneer", 25.0);
		this.toppings_cost.put("tomato", 10.0);
		this.toppings_cost.put("chicken", 30.0); 
		this.toppings_cost.put("barbeqcue", 25.0);
		this.toppings_cost.put(" mozzarrella cheese", 35.0);
		this.toppings_cost.put("bell Pepper", 15.0);  
		this.toppings_cost.put("popcorn", 5.0);
	}
	public Map<String, Double> getSize_cost() {
		return size_cost;
	}
	public void setSize_cost(Map<String, Double> size_cost) {
		this.size_cost=new LinkedHashMap<String,Double>();
		this.size_cost.put("small 8 inch", 50.0); 
		this.size_cost.put("medium 10 inch", 60.0); 
		this.size_cost.put("large 12 inch", 80.0); 
        
	}
	public Map<String, Object> getCrust() {
		return crust;
	}
	public void setCrust(Map<String, Object> crust) {
this.crust = new LinkedHashMap<String, Object>();        
this.crust.put("whole wheat flour", "whole wheat flour"); 
this.crust.put("pita bread", "pita bread");
this.crust.put("thin sanwich bread", "thin sanwich bread");;
	}
	public String[] getToppings() {
		return toppings;
	}
	public void setToppings(String[] toppings) {
		this.toppings = new String[8];
		this.toppings[0]="mushrooms"; 
		this.toppings[1]="paneer";
		this.toppings[2]="tomato";
		this.toppings[3]="chicken"; 
		this.toppings[4]="barbeqcue";
		this.toppings[5]="mozzarrella cheese";
		this.toppings[6]="bell Pepper";  
		this.toppings[7]="popcorn";
	}
	public Map<String, Object> getSize() {
		return size;
	}
	public void setSize(Map<String, Object> size) {
		this.size = new LinkedHashMap<String, Object>();
		 this.size.put("small 8 inch", "small 8 inch"); 
	     this.size.put("medium 10 inch", "medium 10 inch"); 
	     this.size.put("large 12 inch", "large 12 inch"); 
	}

	public Pizza()
    {
		this.delivery = new LinkedHashMap<String, Object>();        
		this.delivery.put("Delivery at home", "Delivery at home"); 
		this.delivery.put("Delivery to neighbour", "Delivery to neighbour");

		crust_cost =new LinkedHashMap<String,Double>();
		toppings_cost=new LinkedHashMap<String,Double>();
		size_cost=new LinkedHashMap<String,Double>();
		
		crust = new LinkedHashMap<String, Object>();
        
        crust.put("whole wheat flour", "whole wheat flour"); 
        crust.put("pita bread", "pita bread");
        crust.put("thin sanwich bread", "thin sanwich bread");
    
    	this.toppings = new String[8];
		this.toppings[0]="mushrooms"; 
		this.toppings[1]="paneer";
		this.toppings[2]="tomato";
		this.toppings[3]="chicken"; 
		this.toppings[4]="barbeqcue";
		this.toppings[5]="mozzarrella cheese";
		this.toppings[6]="bell Pepper";  
		this.toppings[7]="popcorn";
     
		size = new LinkedHashMap<String, Object>();
		 size.put("small 8 inch", "small 8 inch"); 
	     size.put("medium 10 inch", "medium 10 inch"); 
	     size.put("large 12 inch", "large 12 inch"); 
    
		crust_cost = new LinkedHashMap<String, Double>();
        
		crust_cost.put("whole wheat flour", 30.0); 
		crust_cost.put("pita bread", 20.0);
		crust_cost.put("thin sanwich bread", 15.0);
    
		toppings_cost = new LinkedHashMap<String, Double>();
		toppings_cost.put("mushrooms", 30.0); 
		toppings_cost.put("paneer", 25.0);
		toppings_cost.put("tomato", 10.0);
		toppings_cost.put("chicken", 30.0); 
		toppings_cost.put("barbeqcue", 25.0);
		toppings_cost.put(" mozzarrella cheese", 35.0);
        toppings_cost.put("bell Pepper", 15.0);       
     
		size_cost = new LinkedHashMap<String, Double>();
		 size_cost.put("small 8 inch", 50.0); 
	     size_cost.put("medium 10 inch", 60.0); 
	     size_cost.put("large 12 inch", 80.0); 
        
    }
	
	}
