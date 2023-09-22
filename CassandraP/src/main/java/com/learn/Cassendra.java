package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
public class Cassendra {
	public static void main(String[] args) {
		SpringApplication.run(Cassendra.class, args);
	}
	
	/* Before Running the application need to execute the query to create the table
	 * **create table person(id int primery key,name text,address text,age int,email text);
	 * */
;

}
