import java.util.*;
public class CreateStudent {
	Scanner keyboard = new Scanner(System.in);

	
	public void StudentProfile(int idNumber, int grade, int ExpectedApScore, 
			int ActualApScore, int MetExpectation)
	{
		
		idNumber = keyboard.nextInt();
		grade = keyboard.nextInt();
		ExpectedApScore = keyboard.nextInt();
		ActualApScore = keyboard.nextInt();
		if (ExpectedApScore < ActualApScore)
		{
			MetExpectation = 1;
		}
		if(ExpectedApScore > ActualApScore)
		{
			MetExpectation = -1;
		}
		else MetExpectation = 0;
		
		
	}

}
