package test;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date.toString());
		System.out.println(date.getYear()+" "+date.getMonth()+" "+date.getDay()+" "+date.getHours()+" "+date.getMinutes()+" "+date.getSeconds());
	}
}
