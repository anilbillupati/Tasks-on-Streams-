package Tasks.Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondSmallest {
   
	public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(1,34,65,789,123,43,5,67,87,908098,32,23,3);
		
	numbers.stream().sorted().skip(1).limit(1).forEach(n->System.out.println("Second smallest number is :"+n));
	numbers.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(n->System.out.println("second largest nuber is :"+n));
	
	
	}
    
}
