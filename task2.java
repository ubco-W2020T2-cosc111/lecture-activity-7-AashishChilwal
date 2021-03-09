import java.util.Scanner;
public class task2
{
	public static void main(String[] args) {
	int vowels=0,capital_letter = 0 ;
	String reverse = "";
	Scanner vw = new Scanner(System.in);
	System.out.println ("Enter a string: " );
	String str = vw.nextLine();
	for (int i = 0; i < str.length(); i++) {
	char ch = str.charAt(i);
	    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        ++vowels;
      }
    if (ch >= 65 && ch <=90)
    {
        capital_letter ++ ;
    }
	}
	    //System.out.println("The reversed version of the string is: " + reverse);
	    System.out.println ("The number of vowels in the string is: " + vowels);
		System.out.println ("The number of Uppercase letters in the string is: " + capital_letter);
	    
	}
}

