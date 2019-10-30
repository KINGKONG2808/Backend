package com.dev.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component /** beans thuong */
public class Employee {
	// inject 1 bean vao trong beans khac
	@Autowired
	public Address address;

	public String name = "Ditchimay";
}
