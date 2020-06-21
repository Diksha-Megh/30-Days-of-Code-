/*Given a base-10 integer,n , convert it to binary (base-2). 
Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
*/
package Coding;// You can avoid this 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class June19Day10 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int sum=0;
        int m=0;
        while(n>0)
        {
            if(n%2==1)
            {
                sum++;
                if(sum>m)
                {
                    m=sum;
                }
            }
            else
            {
                sum=0;
            }
            n=n/2;
        }
        System.out.println(m);
    }
}

