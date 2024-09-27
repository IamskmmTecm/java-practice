package com.compareInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		

		ArrayList<Employee> aemp = new ArrayList<>();
		
		
		
		aemp.add(new Employee(1, "Hosina", 90000));
		aemp.add(new Employee(2, "Anju", 1000000));
		aemp.add(new Employee(3, "Pamela", 80000));
		aemp.add(new Employee(4, "Winty", 70000));
		aemp.add(new Employee(5, "Tanya", 150000));
		
		

		
		Collections.sort(aemp);
		
		System.out.println(aemp);
		
		Collections.sort(aemp, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
//		Collections.sort(aemp, (o1, o2) -> {
//				return o1.getName().compareTo(o2.getName());
//			});
		//// By lamda Exp. ////
		Collections.sort(aemp, (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		});

		System.out.println(aemp);





	}

}
