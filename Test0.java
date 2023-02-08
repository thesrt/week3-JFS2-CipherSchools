package Week3;

import java.util.ArrayList;

public class Test0 {
	public static void main(String[] args) {
		//forEach - this method helps us in accessing all the elements of
		//given collection and call a common method on all elements.
		
		//stream is wrapper around your data source so that we can do the
		//bulk processing conveniently and fast.
		
		ArrayList<String> lang = new ArrayList<String>();
		lang.add("Java");
		lang.add("CSharp");
		lang.add("Python");
		lang.add("PHP");
		
	    lang.forEach(System.out::println);
	}
}
