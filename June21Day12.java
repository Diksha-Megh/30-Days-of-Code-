/*You are given two classes, Person and Student, where Person is the base class and Student is the derived class. 
Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.
Complete the Student class by writing the following:
A Student class constructor, which has  parameters:
A string,firstName .
A string,lastName .
An integer,id .
An integer array (or vector) of test scores,scores .
A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
        (a>=90 && a<=100) return 'O';
        (a>=80 && a<=90) return 'E';
        (a>=70 && a<=80) return 'A';
        (a>=55 && a<=70) return 'P';
        (a>=40 && a<=55) return 'D';
        return 'T';
*/
package Coding;
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName,String lastName,int identification,int[] testScores)
    {
        super(firstName,lastName,identification);
        this.testScores=testScores;
    }
    char calculate()
    {   
        int total=0;
        for(int testScore:testScores) total+=testScore;
        int a= total/testScores.length;
        if(a>=90 && a<=100) return 'O';
        if(a>=80 && a<=90) return 'E';
        if(a>=70 && a<=80) return 'A';
        if(a>=55 && a<=70) return 'P';
        if(a>=40 && a<=55) return 'D';
        return 'T';
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}

class June21Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
