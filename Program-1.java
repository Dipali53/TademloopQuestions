/*Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string*/

import java.util.Scanner;
import java.lang.Math;
class A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String s = sc.next();
		double ans = 0;
		char operation = s.charAt(0);
		switch(operation){
			case 'A': ans = a+b;
						break;
			case 'S': ans = Math.abs(a-b);
						break;
			case 'M': ans = a*b;
						  break;
			case 'D': ans = a/b;
						   break;
			default: System.out.println("Entered wrong value");
					 break;
		}
		System.out.println(s+" = "+ans);
	}
}
