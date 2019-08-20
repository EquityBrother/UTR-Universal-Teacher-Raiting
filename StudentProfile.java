import java.util.Random;
public class StudentProfile {
	Random rand = new Random();

	private String name = "0";
	private int grade = 0;
	private int ExpectedApScore = 0;
	private int ActualApScore = 0;
	private int MetExpectations = 0;
	public  StudentProfile() 
	{
		double x = Math.random()*9000+1000;
		final int idNumber = (int)x;
		name = "s"+idNumber;
		 grade = 0;
		 ExpectedApScore = 0;
		 ActualApScore = 0;
		 MetExpectations = 0;
	}
	
	public void  setProfile (String NewName, int NewGrade, int NewExpected, int Actual, int Expectation) 
	{
		name = NewName;
		grade = NewGrade;
		ExpectedApScore = NewExpected;
		ActualApScore = Actual;
		MetExpectations = Expectation;
	}
	
		public String getName()
		{
			return name;
		}
		public int getGrade()
		{
			return grade;
		}
		public int getApScore()
		{
			return ActualApScore;
		}
		public int getExpected()
		{
			return ExpectedApScore;
		}
		public int getExpectations()
		{
			return MetExpectations;
		}
	
		
}
