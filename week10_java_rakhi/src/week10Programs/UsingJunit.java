package week10Programs;

import java.util.List;
import java.util.stream.Collectors;

public class UsingJunit {
 
	public static void main(String[] args) {
		List<Employee> emplist =EmployeeData.getAllData();
		emplist.stream().findAny(e->e.getName().equals("AKhila"));
		
		ifPresent().
	}
}
