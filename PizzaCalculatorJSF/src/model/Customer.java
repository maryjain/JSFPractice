package model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "customer")
@SessionScoped
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
String name;
String phone;
String custid;
public Customer()
{
 name ="";
 phone="";
 custid="";
}

public Customer(String name,String phone,String id)
{
 this.name =name;
 this.phone=phone;
 custid=id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getCustid() {
	return custid;
}
public void setCustid(String custid) {
	this.custid = custid;
}
}
