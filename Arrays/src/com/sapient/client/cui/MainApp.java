package com.sapient.client.cui;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Process {
	public int[] create(){
		int[] num; 
		num = new int[10];
		num[3]=6;
		num[7]=9;
		return num;
	}
	
	public void display(int[] src){
		for(int data:src){
			System.out.println(data);
		}
	}
}

class Point {
	int x, y;
	public Point(int input1, int input2){
		x = input1;
		y = input2;
	}
}

class PointFunctions {
	public Point[] createArray() {
		Point[] p;
		p = new Point[10];
		for (int i=0; i<10; i++) {
			p[i] = new Point(i, i+1);
		}
		return p;
	}
	public void displayArray(Point[] pointArray) {
		for (Point data:pointArray) {
			System.out.println(data.x + " , " + data.y);
		}
	}
}

public class MainApp {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		
		int[] num1;
		int[] num2;
		
		num1 = new int[5];
		num2 = new int[5];
		
		num1[3] = 33;

		System.arraycopy(num1, 0, num2, 0, num1.length);
		
		for(int data:num1){
			System.out.println(data);
		}
		System.out.println("BREAK");
		for(int data:num2){
			System.out.println(data);
		}
		
		
		
		/*
		PointFunctions process = new PointFunctions();
		Point[] pointArray;
		
		pointArray = process.createArray();
		process.displayArray(pointArray);
		*/
		
		
		// TODO Auto-generated method stub
		/*
		Process p = new Process();
		int[] result = p.create();
		
		p.display(result);
		*/
		/*
		int[][] num;
		
		num = new int[5][3];
		
		num[1][1] = 5;
		
		for (int[] index:num) {
			for (int data:index) {
				System.out.println(data);
			}
		}
		*/
		/*
		int[][][] num;
		
		num = new int[5][3][2];
		
		num[0][1][1] = 5;
		
		for (int[][] dimension1:num){
			for(int[] dimension2:dimension1) {
				for (int data:dimension2)
					System.out.println(data);
			}
		}*/
		
	}
}
