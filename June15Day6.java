/*Given a string,s , of length n that is indexed from 0 to n-1 ,
 print its even-indexed and odd-indexed characters as 2 space-separated strings 
 on a single line (see the Sample below for more detail).
*/
package Coding; //you can avoid if you are not using it 
import java.util.*;
public class June15Day6 {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc=new Scanner(System.in);
	        int T =sc.nextInt();
	        sc.nextLine();
	        for(int i=0;i<T;i++)
	        {
	            String s=sc.next();
	            char[] charArray=s.toCharArray();
	            for(int k=0;k<charArray.length;k++)
	            {
	                if(k%2==0)
	                {
	                    System.out.print(charArray[k]);
	                }
	            }
	            System.out.print(" ");
	            for(int k=0;k<charArray.length;k++)
	            {
	                if(k%2!=0)
	                {
	                    System.out.print(charArray[k]);
	                }
	            }
	            System.out.println();
	        }
	    }
	

	}


