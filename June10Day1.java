/*Task
Complete the code in the editor below. The variables i, d, and s are already declared and initialised for you. 
You must declare 3 variables: one of type int, one of type double, and one of type String. 
Then you must read 3 lines of input from stdin and initialise your 3 variables. 
Finally, you must use the ++ operator to perform the following operations:
Print the sum of i plus your int variable on a new line.
Print the sum of d plus your double variable to a scale of one decimal place on a new line.
Concatenate s with the string you read as input and print the result on a new line.
Note: If you are using a language that doesn’t support using ++ for string concatenation (e.g.: CC), 
you can just print one variable immediately following the other on the same line. 
The string provided in your editor must be printed first, immediately followed by the string you read as input.*/
/*Input Format

The first line contains an integer, i.
The second line contains a double, d.
The third line contains a string, s.

Output Format

Print the sum of both integers on the first line, the sum of both doubles on the second line, and then the two concatenated strings on the third line.

Sample Input

12
4.0
is the best place to learn and practice coding!
Sample Output

16
8.0
HackerRank is the best place to learn and practice coding!*/
package Coding;
import java.util.*;
public class June10Day1{
	public static void main(String[] args) {
		    int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);

	        /* Declare second integer, double, and String variables. */
	        int i2=scan.nextInt();
	        double d2=scan.nextDouble();
	        scan.nextLine();
	        String s2=scan.nextLine();

	        /* Read and save an integer, double, and String to your variables.*/
	        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
	        
	        /* Print the sum of both integer variables on a new line. */
	        System.out.println(i+i2);

	        /* Print the sum of the double variables on a new line. */
	        System.out.println(d+d2);
			
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */
	        System.out.println(s+""+s2);

	        scan.close();
		
	}
}



