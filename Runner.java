import java.util.*;  
public class Runner {


	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		

	
	
		System.out.println("Number of Students");
		
		int numberOfStudents = keyboard.nextInt();
		
		StudentProfile listOfStudents[] = new StudentProfile[numberOfStudents];
		
		for (int i = 0; i < numberOfStudents; i++) 
		{
		    listOfStudents[i] = new StudentProfile();
		}
		for (int i = 0; i < numberOfStudents; i++) 
		{
	
		    System.out.print(listOfStudents[i].getName());
		    System.out.print(listOfStudents[i].getGrade());
		    System.out.print(listOfStudents[i].getApScore());
		    System.out.print(listOfStudents[i].getExpected());
		    System.out.print(listOfStudents[i].getExpectations());
		    System.out.println();

		}
	}

}

	
