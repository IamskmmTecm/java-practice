package com.mypackage1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

import com.mypackage2.MyClass2;

public class MainClass{

	public static void main(String[] args) {
		System.out.println("Hi Sumit from main class");
		MyClass2 mc2 = new MyClass2();
		MyClass1 mc1 = new MyClass1();
		
		////////////////////// ArrayList /////////////////////////////////////////
//		ArrayList<String> al = new ArrayList<>();
//		
//		al.add("Sumit");
//		al.add("Nalini");
//		al.add(0,"Subham");
//		
//		al.remove(1);
//		al.remove("Nalini"); // either by index or by value we can remove element from
//							 //                                              ArrayList
//		
//		for(String i: al) {
//			System.out.println("Team of size "+al.size()+" with "+i);
//		}
//		
//		Iterator<String> itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println("Names by Iterator : "+ itr.next());
//		}
//		
//		System.out.println(al);
		
		
		
		
//		ArrayList<Object> oal = new ArrayList<>();
//		
//		oal.add(1222);
//		oal.add(511);
//		
//		System.out.println(oal);
//		
//		int i = 0;
//		for(Object oi: oal) {
//			i = i+ (int)oi;  // we can use any one like  int  or  Integer  to parse to int
//		}
//		
//		System.out.println(i);
		
		///////////////////// STACK ///////////////////////////////////////////////
//		Stack<String> st = new Stack<>();
//		
//		st.push("Komal");
//		st.push("Sumit");
//		st.push("Sanjeeb");
//		st.push("Hitapi");
//		
//		System.out.println(st);
//		
//		st.pop();
//		
//		System.out.println(st.contains("Anuj"));
//		System.out.println(st.firstElement());
//		System.out.println(st.pop()+" is removed and the stack is now "+ st);
		
		

//		mc2.myFunctio();
//		System.out.println(mc1.arr[2]);
//		System.out.println(mc1.num);
//		System.out.println(mc1.numFun(1, "Sumit Marik"));
//		System.out.println(mc1.numFun(2, "Aditya Sahu"));
		
		//////////////////////////// Map-HashMap //////////////////////////////////////////////////

		Map<Integer, String> fm = new HashMap<>();
		
		fm.put(1, "Box");
		fm.put(2, "Ball");
		fm.put(3, "Ring");
		fm.put(4, "pen");
		fm.put(5, "pencil");
		fm.put(6, "Box");
		
		System.out.println(fm);
		
		for(Map.Entry<Integer, String> e: fm.entrySet()) {
			System.out.println(e.getKey()+" -> "+e.getValue());
		}
		
		
		 String o =fm.remove(4);
		
		System.out.println(fm);
		System.out.println(o);
		System.out.println(fm.size());
		
//		System.out.println(mc1.size());
		
		
		


		

	}

	


}
