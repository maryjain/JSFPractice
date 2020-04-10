package model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name = "order")
@SessionScoped

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	String custid;
	
	String[] toppings;
	Double toppings_cost;
	String bottom;
	Double bottom_cost;
	String size;
	Double size_cost;
	Double totalcost;
	String typeofdelivery;
	String orderid;
	Pizza pizza;
public Order()
{
	pizza=new Pizza();
	orderid="";
	custid="";
	toppings_cost=0.0;
	bottom_cost=0.0;
	size_cost=0.0;
    toppings= new String[8];
    bottom="";	
	totalcost=0.0;
	typeofdelivery="";
	size="";
	
}
public Double getToppings_cost() {
	return toppings_cost;
}

public void setToppings_cost(Double toppings_cost) {
	this.toppings_cost = toppings_cost;
}

public Double getBottom_cost() {
	return bottom_cost;
}

public void setBottom_cost(Double bottom_cost) {
	this.bottom_cost = bottom_cost;
}

public Double getSize_cost() {
	return size_cost;
}

public void setSize_cost(Double size_cost) {
	this.size_cost = size_cost;
}

public Pizza getPizza() {
	return pizza;
}

public void setPizza(Pizza pizza) {
	this.pizza = pizza;
}

public String getOrderid() {
	return orderid;
}
public void setOrderid(String orderid) {
	this.orderid = orderid;
}
public String getCustid() {
	return custid;
}
public void setCustid(String custid) {
	this.custid = custid;
}

public double getTotalcost() {
	return totalcost;
}
public void setTotalcost(double totalcost) {
	this.totalcost = totalcost;
}
public String getTypeofdelivery() {
	return typeofdelivery;
}
public void setTypeofdelivery(String typeofdelivery) {
	this.typeofdelivery = typeofdelivery;
}

public String[] getToppings() {
	return toppings;
}
public void setToppings(String[] toppings) {
	this.toppings = toppings;
}
public String getBottom() {
	return bottom;
}
public void setBottom(String bottom) {
	this.bottom = bottom;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}

public String calculatePizzaOrder() {
	this.totalcost=0.0;
	this.toppings_cost=0.0;
	for (Map.Entry<String,Double> entry : pizza.getCrust_cost().entrySet()) {
	    if( entry.getKey().equals(this.bottom)) {	    	
	    	this.bottom_cost= entry.getValue();   		    	
	    	break;
	    }
	   
	}
	for(String topping:this.toppings) {
	for (Map.Entry<String,Double> entry : pizza.getToppings_cost().entrySet()) {
	    if( entry.getKey().equals(topping)) {
	    	this.toppings_cost= this.toppings_cost + entry.getValue(); 	
	    	break;	    	
	    }
	   
	}
	}
	
	for (Map.Entry<String,Double> entry : pizza.getSize_cost().entrySet()) {
	    if( entry.getKey().equals(this.size)) {	    	
	    	this.size_cost= entry.getValue();   		    	
	    	break;
	    }
	   
	}
	
	this.totalcost=this.bottom_cost+this.toppings_cost+this.size_cost;
		
	return "output";
}

}
