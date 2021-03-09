import java.util.Scanner;
public class task3
{
	public static void main(String[] args) {
	    Scanner num = new Scanner(System.in);
	    Scanner gpa_1 = new Scanner(System.in);
		System.out.println("Enter the number of students (1 to 50 ): ");
		int number = num.nextInt();
		for (int i = 1; i <= number ; i++)
		{
		    System.out.println("Enter the Gpa of Student " + i + " : " );
		    double gpa = gpa_1.nextDouble();
		    if (gpa < 0 && gpa > 4)
		    {
             System.out.println("Invalid GPA value. Try again: " );
             gpa = gpa_1.nextDouble();
		}
		else 
		{
		    continue;
		}
	}
}
}
