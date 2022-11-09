package lintCodeWithMrChen;

import java.util.ArrayList;
import java.util.List;

public class A0009_FizzBuzz {
	public List<String> fizzBuzz(int n){
		List<String> list = new ArrayList<String>();
		for(int i = 1; i <= n; i++) {
			if(i % 15 == 0) list.add("fizz buzz");
			else if(i % 3 == 0) list.add("fizz");
			else if(i % 5 == 0) list.add("buzz");
			else list.add(String.valueOf(i));
		}
		return list;
	}

}
