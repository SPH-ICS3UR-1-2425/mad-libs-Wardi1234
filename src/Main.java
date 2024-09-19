import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("You are currently under trial");
		System.out.println("You are being charged as the greatest package theif of all time ");
		System.out.println("State your Name");
		String name = in.nextLine();
		System.out.println("Just How many packages did you steal?"); 
        System.out.println("Give me a number.");         
	    int num1 = in.nextInt();
        System.out.println("Just how much money did you get from this");
        System.out.println("Give me a number. Down to the cents");
	    //flush    in.nextLine();
        double decNumber = in.nextDouble(); 
        in.nextLine();
        System.out.println("We know you had a partner in crime");
        System.out.println("Give me a name");
        String name2 = in.nextLine();
        System.out.println("We searched your house and couldn't find the packages");
        System.out.println("Where did you keep the packages? give me a place");
        String place = in.nextLine();
        System.out.println("Why have you done all this?"); 
        System.out.println("Give us an anwser `");
        String anwser = in.nextLine();
        System.out.println("You had stolen a lot during your run");
        System.out.println("What was your favorite thing you stole");
        String Favthing = in.nextLine();
        System.out.println("We noticed that you had an animal with you during your crimes");
        System.out.println("What type of animal was it?");
        String Animal = in.nextLine();
        System.out.println("You've stolen packages from all over the place.");
        System.out.println("Just how many cities have you been to during your run?");
        int cities = in.nextInt();
        in.nextLine();
        System.out.println("You have had many nicknames throughout the years");
        System.out.println("which one was your favorite?");
        String Nickname = in.nextLine();
        System.out.println(name+ ", the greatest Package theif of all time" );
        System.out.println("You have been brought to trial today for your great crimes"); 
        in.nextLine();
        System.out.println("You have stolen" +num1+ "Packages, worth" +decNumber);
        System.out.println(name+ "has stolen with" +name2+ "and a(n)"+Animal);
        in.nextLine();
        System.out.println("Their prized stolen possession was their" +Favthing);
        System.out.println("They stored their stolen goods at"+place+"Stole from"+cities+"Cities");
        in.nextLine(); 
        System.out.println("The reason"+name+ "the"+Nickname+ "stole was because"+anwser);
        in.nextLine();
        System.out.println("Due to these reasons, Judge Higura sentences "+name+" To...");
        System.out.println("Guilty! 900 consecutive life sentences is your punishment");
        System.out.println("The end");
	
	}

}
// oh my gosh oh my goodness. qiuytrueyiqghjsdh.  