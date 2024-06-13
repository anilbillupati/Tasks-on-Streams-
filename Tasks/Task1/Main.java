package Tasks.Task1;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
		
		List<Employee> list1=new ArrayList<>();
		list1.add(new Employee("Anil",23,23455));
		list1.add(new Employee("Pavan",26,40000));
		list1.add(new Employee("Dinesh",30,50000));
		list1.add(new Employee("Venkatesh",20,20000));
		list1.add(new Employee("Hussain",35,234566));
		
		List<Employee> list2=new ArrayList<>();
		
		list2.add(new Employee("Sunil",23,100000));
		list2.add(new Employee("Krishna Kishore",9,10000));
		list2.add(new Employee("Siddarth",45,789009));
	
		//Merged the 2 Array lists.and sorted them in Descending order 
		   Stream.of(list1,list2).flatMap(Collection::stream)
		   .sorted(Comparator.comparingInt(Employee::getAge).reversed())
		   .collect(Collectors.toList()).forEach(System.out :: println);
	}
   
}