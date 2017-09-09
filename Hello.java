import java.util.Scanner;

// void indicates that the method does not return a value
// static indicates that the variables and methods belongs to the class
//     instead of to a specific instance 

public class Hello {	
  static void sayHello() {
		System.out.println("Hello. What is your name?");
		System.out.println("Please enter your name.");
  }

  // method is typed int because returned value is int?
  static int age(int presentYear, int birthYear) {
    return presentYear - birthYear;
  }

  static void getPet() {
    System.out.println("Please tell me about your pet dog.");
    System.out.println("What its name?");
    Scanner name = new Scanner(System.in);
    String petName = name.nextLine();
    Animal pet = new Animal(); 
    pet.bark();
    pet.greet(petName);
  }

	public static void main(String[] args) {
    sayHello();
    Scanner nameInput = new Scanner(System.in);
    System.out.println("Welcome " + nameInput.nextLine() + "!");
    System.out.println("Please enter your birth year");
    Scanner birthYearInput = new Scanner(System.in);
    int birthYear = birthYearInput.nextInt();
    int calculatedAge = age(2017, birthYear);
    System.out.println("Your age is " + calculatedAge + ".");
    getPet();
  }
}
