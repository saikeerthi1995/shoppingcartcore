package com.niit.shoppingcart;

import org.springframework.stereotype.Component;

@Component

public class category {

	private String id;
	private String name;
	private String descrption1;
	public String getid(){
		return id;
	}
	public void setId(String id){
 
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrption() {
		return descrption1;
	}
	public void setDescrption(String descrption) {
		this.descrption1 = descrption1;
	
	}
}
