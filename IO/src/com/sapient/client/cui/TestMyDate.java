/*package com.sapient.client.cui;

class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		// TODO Auto-generated constructor stub
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public MyDate addDays(int numberOfDays) {
		MyDate newDate = new MyDate(this.getDay()+numberOfDays, this.getMonth(), this.getYear());
		//wraparound
		return newDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (day+ "/" + month + "/" + year);
	}
	
}

public class TestMyDate {
	public static void main(String[] args) {
		MyDate myBirth = new MyDate(22,7,1964);
		MyDate theNextWeek = myBirth.addDays(7);
		
		System.out.println(theNextWeek);
		System.out.println(myBirth);
	}
}*/
