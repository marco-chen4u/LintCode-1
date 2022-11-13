package lintCodeWithMrChen;

import java.util.ArrayList;
import java.util.List;


/***
*LintCode-9 · Fizz Buzz
*Given number n. Print number from 1 to n. According to following rules:

*when number is divided by 3, print "fizz".
*when number is divided by 5, print "buzz".
*when number is divided by both 3 and 5, print "fizz buzz".
*when number can't be divided by either 3 or 5, print the number itself.
	
*Example 1:
*	Input:
*		n = 15
*	Output:
*		[
*		  "1", "2", "fizz",
*		  "4", "buzz", "fizz",
*		  "7", "8", "fizz",
*		  "buzz", "11", "fizz",
*		  "13", "14", "fizz buzz"
*		]
*
*Challenge
*	Can you do it with only one if statement?
***/	

			
//solution-1: for loop with if-esle 			
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
