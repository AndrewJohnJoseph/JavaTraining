package com.apriltenth.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
import java.util.stream.IntStream;

import com.april.models.EmployeeDetails;

public class MyPredefinedFunctions {

	public static void main(String[] args) {
		List<String> lstAnimals = Arrays.asList("Rat", "Cat", "Lion", "", "Tiger", "Elephant", "Dog", "Deer", "Bear");

		System.out.println(lstAnimals);

		System.out.println(lstAnimals.stream().count());

		System.out.println(lstAnimals.stream().filter((str) -> str.isEmpty()).count());

		System.out.println(lstAnimals.stream().filter((str) -> str.length() == 3).count());

		System.out.println(lstAnimals.stream().filter((str) -> !str.isEmpty()).count());

		List<String> notEmptyList = lstAnimals.stream().filter((str) -> !str.isEmpty()).toList();
		System.out.println(notEmptyList);

		List<Integer> lstNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		System.out.println(lstNumbers);

		IntSummaryStatistics summary = lstNumbers.stream().mapToInt(i -> i).summaryStatistics();

		System.out.println(summary.getMax());
		System.out.println(summary.getCount());
		System.out.println(summary.getSum());

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(IntStream.of(numbers).max().getAsInt());
		System.out.println(IntStream.of(numbers).count());
		System.out.println(IntStream.of(numbers).sum());

//		IntStream.of(numbers).sorted().forEach(System.out::println);
		
		System.out.println(IntStream.range(10, 12).sum()); //10+11
		  System.out.println(IntStream.rangeClosed(1, 5).sum()); //1+2+3+4+5
		  
		  System.out.println("Reduce : " + IntStream.of(numbers).reduce(5, (x,y)->x+y));
		  
		  
		  EmployeeDetails[] ed1 = { new EmployeeDetails(1, "Andrew", "Male"), new EmployeeDetails(2, "Hannah", "Female"), new EmployeeDetails(3, "Dedalus", "Male") };
			
			List<EmployeeDetails> lstEmployees = Arrays.asList(ed1);
			System.out.println(lstEmployees);
			
			boolean result = lstEmployees.stream().anyMatch(emp -> emp.getGender().matches("Male"));
			if(result) {
				System.out.println("Male Employees are available");
			}
			else {
				System.out.println("Only Female Employees are available");
			}
			
			Map<String, List<EmployeeDetails>> groupByGender = lstEmployees.stream().collect(Collectors.groupingBy(EmployeeDetails::getGender));
	}

}
