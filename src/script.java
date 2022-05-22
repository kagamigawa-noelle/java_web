import com.example.jsp.Employee;

import java.util.ArrayList;
import java.util.List;

public class script {
   public static void main (String[] args) {
//	  int x = 10;
//	  String str = "你好";
	  List<Employee> emps = new ArrayList<>();
	  for (int i = 0; i <= 5; i++) {
		 emps.add(new Employee(i, "emp" + i, 18 + i, "emp" + i + "@163.com"));
	  }
	  
	  for (int i = 0; i < emps.size(); i++) {
		 Employee emp = emps.get(i);
		 System.out.println(emp.getId());
		 System.out.println(emp.getName());
		 System.out.println(emp.getAge());
		 System.out.println(emp.getEmail());
		 
	  }
   }
}
