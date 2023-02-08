//The Map Method
//Map method is used to map each elements to its corresponding function.

package Week3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code2 {
	public static void main(String[] args) {
		
		List<Integer>myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> result = myList.stream().map(e -> e*e).collect(Collectors.toList());
		
		System.out.println(result);
	}
}
