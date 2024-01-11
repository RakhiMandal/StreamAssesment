package week10Programs;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class YoungestInDepartment {

	public static void main(String[] args) {
		List<Employee> emplist =EmployeeData.getAllData();
		

		Optional<Employee> youngestMale = emplist.stream().filter(e->e.getGender().equalsIgnoreCase("Male")).collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));
		System.out.println(youngestMale);
	}

}


