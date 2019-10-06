package com.cg;

import java.time.Instant;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date date=new Date();
System.out.println("Date:- "+date);
Instant instant=Instant.now();
System.out.println(instant);
System.out.println(date.from(instant));
	}
}
