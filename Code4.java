//Filter --------------

package Week3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Code4 {
public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,-44,19,21,-55,77);
		
		//let us write filter to extract Negative Numbers Only.
		//criteria : num < 0
		
		List<Integer> result = numbers.stream().filter(e -> e<0).collect(Collectors.toList());
		
		System.out.println(result);
}
}
