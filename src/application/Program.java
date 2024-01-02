package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How manny people will be added? ");
		int numberPeoples = scanner.nextInt();
		
		
		scanner.close();
	}

}
