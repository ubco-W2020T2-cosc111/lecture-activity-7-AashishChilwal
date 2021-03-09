import java.util.Scanner;
public class task3
{
	public static void main(String[] args) {
	    Scanner num = new Scanner(System.in);
	    double gpa = 0.0;
	    Scanner gpa_1 = new Scanner(System.in);
		System.out.println("Enter the number of students (1 to 50 ): ");
		int number = num.nextInt();
		for (int i = 1; i <= number ; i++)
		{
		    System.out.println("Enter the Gpa of Student " + i + " : " );
		    gpa = gpa_1.nextDouble();
		    if (gpa < 0.0 || gpa > 4.0)
		    {
             System.out.println("Invalid GPA value. Try again: " );
             gpa = gpa_1.nextDouble();
            		}
		else 
		{
		    continue;
		}
	}
	System.out.println("The highest Gpa in the class is: " + gpa);
}
}
