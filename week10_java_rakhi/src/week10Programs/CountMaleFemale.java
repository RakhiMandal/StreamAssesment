package week10Programs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountMaleFemale {

	public static void main(String[] args) {
		List<Employee> emplist =EmployeeData.getAllData();
		System.out.println("Males :"+emplist.stream().filter(employee->employee.getGender().equalsIgnoreCase("male")).count());
        System.out.println("Females :"+emplist.stream().filter(employee->employee.getGender().equalsIgnoreCase("female")).count());	
//		or method2
		Map<String, Long> countMaleFemale = emplist.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(countMaleFemale);
	
	}
	System.out.println("a little bit of modification");
	System.out.println("count of the male and female");

}


