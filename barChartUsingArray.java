/*
 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.
input
5
3
1
0
7
5

output
			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*	
 */

 import java.util.*;
 import java.io.*;
public class barChartUsingArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
    
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]>max){
            max=arr[i];
          }
        }
    
        for (int flore = max; flore >=1; flore--) {
          for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=flore) {
              System.out.print("*\t");
            } else {
              System.out.print("\t");
            }
          }
            System.out.println();
        }
    
    
      }
}
