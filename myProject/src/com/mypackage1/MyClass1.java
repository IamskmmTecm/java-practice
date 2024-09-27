package com.mypackage1;

import java.util.HashMap;

public class MyClass1 extends HashMap<String, Integer> implements MyInterface1 {
	
	private String color = "red";
	
	public int i = 1111;
	
	protected int arr[] = {2,44,11,688};
	
	int num = 55;
	
	
	
	public MyClass1(String color, int i, int num) {
		super();
		this.color = color;
		this.i = i;
		this.num = num;
	}

	@Override
	public String numFun(int a1, String s1) {
		return a1+" My Name "+s1;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public MyClass1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void con() {
		MyClass1 mc2 = new MyClass1("Red", 10, 11);

	}
	
		@Override
	  public int size() {
		  	int size = 10;
	        return size;
	    }
}
