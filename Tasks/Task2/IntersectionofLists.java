package Tasks.Task2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class IntersectionofLists {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2=Arrays.asList(3,4,5,6,7,8,9,10);
		System.out.println(list1.stream().filter(list2::contains).collect(Collectors.toList()));
		
		List<String> names=Arrays.asList("Java","C","python","COBOL","Kotlin","HTTML5","DeepLearning","C#");
		//sorted by length
		names.stream().sorted(Comparator.comparingInt(String::length)).forEach(n-> System.out.print(n+" "));
		//sorted by natural order
		System.out.println(names.stream().sorted().collect(Collectors.toList()));
	} 
}
