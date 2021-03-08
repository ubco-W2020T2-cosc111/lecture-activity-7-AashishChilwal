import java.util.Scanner ;
public class task4
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int number = input.nextInt();
		System.out.println("Pattern I ");
		System.out.println("--------- ");
	  for (int i = 1; i <= number; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
    System.out.println(" ");
	System.out.println("Pattern II ");
	System.out.println("---------- ");
	  for (int i = number; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
	}
}
