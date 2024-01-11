package week10Programs;

import java.util.List;

public class JoinedAfter2015 {

	public static void main(String[] args) {
		List<Employee> emplist =EmployeeData.getAllData();
		emplist.stream().filter(e->e.getYearOfJoining()>2015).forEach(e->System.out.println(e.getName()));
		

	
	}
}
