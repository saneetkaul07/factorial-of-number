// { Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking testcases
        int T = sc.nextInt();
        while (T-- > 0) {
            
            //creating an object of class Factorial
            Solution obj = new Solution();
            int N;
            
            //taking N
            N = sc.nextInt();
            
            //calling factorial() method 
            //of class Factorial
            System.out.println(obj.factorial(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

   
       static long factorial(int N){
        
        long result=1;
        
        for(int i=1;i<=N;i++){
            
            result*=i;
        }
     return result;   
    }
    
   
}
