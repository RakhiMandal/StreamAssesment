package week10Programs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountMaleFemale {

	public static void main(String[] args) {
		List<Employee> emplist =EmployeeData.getAllData();
		System.out.println("Males :"+emplist.stream().filter(e->e.getGender().equalsIgnoreCase("male")).count());;
		System.out.println("Females :"+emplist.stream().filter(e->e.getGender().equalsIgnoreCase("female")).count());
		
//		or
		Map<String, Long> countMaleFemale = emplist.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(countMaleFemale);
		
	
	}

}

