/*
output

 				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*	


 */

import java.util.*;

public class pattern3{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for(int i=0;i<n ;i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("\t");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*\t");
            }
            System.out.println();
        } 

    }
}