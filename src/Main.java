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
		System.out.println("Just How many packages did you steal"); 
        System.out.println("Give me a number");         
	    int num1 = in.nextInt();
        System.out.println("Just how much money did you get from this");
        System.out.println("Give me a number. Down to the cents");
	    //flush    in.nextLine();
        double decNumber = in.nextDouble(); 
        in.nextLine();
        
        String place = in.nextLine();
        System.out.println("One day, "+name+ " wrote " +num1+ " Mad Libs projects in "+place  );
    
        
        
        
        
	}

}
// oh my gosh oh my goodness. qiuytrueyiqghjsdh.  