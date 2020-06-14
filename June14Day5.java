/*Given an integer,n, print its first  multiples. Each multiple n*i  
 (where 1<=i<=10) should be printed on a new line in the form: n x i = result.
*/
package Coding; //you can avoid if you have not made any package ! 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class June14Day5{
	 private static final Scanner scanner = new Scanner(System.in);

	 public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if(n>=2 && n<=20)
	        {
	            int a;
	            for(int i=1;i<=10;i++)
	            {
	                a=n*i;
	                System.out.println(n+" "+"x"+" "+i+" "+"="+" "+a);
	            }
	        }

	        scanner.close();
	    }
	    
	}








   