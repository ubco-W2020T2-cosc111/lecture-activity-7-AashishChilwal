import java.util.Scanner;
public class task2
{
	public static void main(String[] args) {
	int vowels=0 ;
	Scanner vw = new Scanner(System.in);
	System.out.println ("Enter a string: " );
	String str = vw.nextLine();
	for (int i = 0; i < str.length(); i++) {
	char ch = str.charAt(i);
	    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        ++vowels;
      }
	}
	System.out.println (vowels);
	}
}

