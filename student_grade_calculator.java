//student grade calculator
import java.util.Scanner;
public class student_grade_calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks for the 5 subjcets out of 100");
		System.out.print("Enter the marks of 1st subject:");
		float sub1=sc.nextFloat();
		System.out.print("Enter the marks of 2nd subject:");
		float sub2=sc.nextFloat();
		System.out.print("Enter the marks of 3rd subject:");
		float sub3=sc.nextFloat();
		System.out.print("Enter the marks of 4th subject:");
		float sub4=sc.nextFloat();
		System.out.print("Enter the marks of 5th subject:");
		float sub5=sc.nextFloat();
		
		float total=(sub1+sub2+sub3+sub4+sub5);
		float avg=(total/5);
		System.out.println("Total marks are: "+total);
		System.out.println("Average percentage is: "+avg+"%");
		
		if(avg>=90.00)
		{
			System.out.println("Your grade is 'A'");
		}
		else if(avg>=75.00)
		{
			System.out.println("Your grade is 'B'");
		}
		else if(avg>=60.00)
		{
			System.out.println("Your grade is 'C'");
		}
		else if(avg>=50.00)
		{
			System.out.println("Your grade is 'D'");
		}
		else
		{
			System.out.println("Your grade is 'E'");
		}
	}
}