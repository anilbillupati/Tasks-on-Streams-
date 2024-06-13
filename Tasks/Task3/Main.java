package Tasks.Task3;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
 
        public static void main(String[] args) {
            Employee emp1 = new Employee(6, "venkatesh", 10300, "pass");
            Employee emp2 = new Employee(1, "sureesh", 70000, "Integration");
            Employee emp3 = new Employee(56, "Anil", 89300, "pass");
            Employee emp4 = new Employee(78, "Saraswathi", 65300, "pass");
            Employee emp5 = new Employee(10, "Hussain ", 59300, "QA");
            Employee emp6 = new Employee(91, "Krishna ", 40300, "pass");
            Employee emp7 = new Employee(61, "Dinesh", 20300, "pass");
            Employee emp8 = new Employee(401, "PavanKlayan", 886200, "Enterprise");
            Employee emp9 = new Employee(541, "Abhiram", 48300, "Enterprise");
            Employee emp10 = new Employee(81, "Sunil", 60300, "UI");
    
            ArrayList<Employee> arrlist = new ArrayList<Employee>();
            arrlist.add(emp1);
            arrlist.add(emp2);
            arrlist.add(emp3);
            arrlist.add(emp4);
            arrlist.add(emp5);
            arrlist.add(emp6);
            arrlist.add(emp7);
            arrlist.add(emp8);
            arrlist.add(emp9);
            arrlist.add(emp10);
            
              arrlist.stream()
                  .filter(emp-> emp.getSalary()>=50000)
                  .collect(Collectors.groupingBy(Employee :: getDeptname));
                 
        }
}


