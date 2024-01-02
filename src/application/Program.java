package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How manny people will be added? ");
		int numberPeoples = scanner.nextInt();
		
		
		Person[] vect = new Person[numberPeoples];
		
		for (int i = 0; i < vect.length; i ++) {
			scanner.nextLine();
			System.out.println("Enter details of person number:  " + (i +1) + "º");
			
			System.out.println("Name: ");
			String name = scanner.nextLine();
			
			System.out.println("Age: ");
			int age = scanner.nextInt();
			
			System.out.println("Height: ");
			double height = scanner.nextDouble();
			
			vect[i] = new Person(name, age, height);
			
		}
		
		double avgHeight = 0.0;
		for (int i = 0; i < vect.length; i++) {
			avgHeight = avgHeight + (vect[i].getHeight() / vect.length);
		}
		
		int underAge = 0;
		for (int i = 0; i < vect.length; i ++) {
			
			if (vect[i].getAge() < 16) {
				underAge ++;
			}			
		}
		
		double percentageUnderAge = ((double)underAge / numberPeoples) * 100;
		
		System.out.printf("Average Height = %.2f", avgHeight);
		System.out.printf("%nPeoples underage = %.1f%%", percentageUnderAge);
		
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i].getAge() < 16) {
				System.out.printf("%n%s", vect[i].getName());
			}
		}
		
		scanner.close();
	}

}
