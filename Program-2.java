/*Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]

    Output: (examples)
        1) input a = 1, then output : 1
        2) input a = 2, then output : 1, 3
        3) input a = 3, then output : 1, 3, 5
        4) input a = 4, then output : 1, 3, 5, 7
        .
        .
        X) input a = x, then output : 1, 3, 5, 7, .......*/

import java.util.Scanner;
class B{
	public static void print(int n){
		int count =0;

		for(int i = 1;i<=n*n;i=i+2){
				count++;
				 if(count == n){
					System.out.print(i);
					break;
				  }else{
					System.out.print(i+",");
				  }
			}
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
	}
}
