/*
This program is for getting nth number in the fibonacci series 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
Used HashMap in java
Implementation using dynamic programming, memoization of the values
*/

import java.io.*;
import java.util.*;

public class fibonacci {
    static HashMap<Integer, Integer> fib = new HashMap<Integer, Integer>();

	static int fib(int n) {
		int first, second;
		if(fib.containsKey(n-1)) {
			Integer g = fib.get(n-1);
			first = g;
		}
		else {
			first = fib(n-1);
		}
		if(fib.containsKey(n-2)) {
			Integer g = fib.get(n-2);
			second = g;
		}
		else {
			second = fib(n-2);
		}

		int result;
		result = first + second;
		fib.put(n, result);
		return result;
	}

    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        fib.put(1, 1);
		fib.put(2, 1);
		System.out.println("Enter n:");
		int n;
		n = sc.nextInt();
		System.out.println("The "+ n +" fibonacci number is: " + fib(n));
    }
}
/*
Divitas-MacBook-Air:java divita$ javac fibonacci.java
Divitas-MacBook-Air:java divita$ java fibonacci
Enter n:
4
The 4 fibonacci number is: 3
Divitas-MacBook-Air:java divita$ java fibonacci
Enter n:
6
The 6 fibonacci number is: 8
Divitas-MacBook-Air:java divita$ java fibonacci
Enter n:
9    
The 9 fibonacci number is: 34
Divitas-MacBook-Air:java divita$ java fibonacci
Enter n:
40
The 40 fibonacci number is: 102334155
Divitas-MacBook-Air:java divita$ java fibonacci
Enter n:
10
The 10 fibonacci number is: 55
Divitas-MacBook-Air:java divita$ java fibonacci
Enter n:
12
The 12 fibonacci number is: 144
Divitas-MacBook-Air:java divita$ 
*/
