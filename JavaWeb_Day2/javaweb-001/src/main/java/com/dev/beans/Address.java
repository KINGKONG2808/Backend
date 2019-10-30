package com.dev.beans;

import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

@Component /** dinh nghia mot bean thuong */
//@Controller /* dung cho mvc*/
//@Service /** dung cho tang trancitionsx*/
//@Repository /* dung cho module: spring boot starter data jpa*/
public class Address {
	public String address1;
	public String address2;

	public Address() {
		this.address1 = "Bac Ninh";
		this.address2 = "Nhu Lone";
	}
}
