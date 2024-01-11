package week10Programs;

import java.util.List;
import java.util.stream.Collectors;

public class SalesMarketing {
	public static void main(String[] args) {
		List<Employee> emplist =EmployeeData.getAllData();
		emplist.stream().filter(e->e.getDepartment().equalsIgnoreCase("Marketing") ||e.getDepartment().equalsIgnoreCase("Sales")).collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(e ->{System.out.println("Department - " + e.getKey());
		
		e.getValue().stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet().forEach((e1)->System.out.println(e1.getKey()+"-->"+e1.getValue()));});

	}
	
}


