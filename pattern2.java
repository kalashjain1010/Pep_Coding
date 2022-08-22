/*1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

output
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*	


*/

import java.util.*;

public class pattern2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                
            System.out.print("*\t");
            }
        System.out.println();
        }

    }
}