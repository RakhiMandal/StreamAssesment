package week10Programs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfAllEmplyeesInEachDept {

	public static void main(String[] args) {
		List<Employee> emplist =EmployeeData.getAllData();
		Map<String, List<Employee>> list = emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		list.entrySet().stream().forEach(e->System.out.println("Department name :"+e.getKey() +" \nEmployee details: \n"+e.getValue()));

	}

}
