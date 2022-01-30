
/*Problem-4: Get the total count of number list in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
(examples)
input: [1,2,8,9,12,46,76,82,15,20,30]
Output:
{1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}*/


import java.util.Scanner;

class D{
	public static int[] inputArr(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void printArray(int arr[]){
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void multiple(int arr[]){
		int j=0;
		int count =0;
		for(int i=1;i<=9;i++){
			count = 0;
			for( j=0;j<arr.length;j++){
					if(arr[j]%i==0){
					count++;
				}
			}
			System.out.print(i+":"+count+" ");
			
		}
		System.out.println();
		
	}
	public static void main(String[] args){
		int arr[] = inputArr();
		printArray(arr);
		multiple(arr);
	}
}
