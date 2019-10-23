package basics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		//Print to screen
		System.out.println("This is me printing");
		System.out.print("This is also printing, but no newline at the end.");
		System.out.println("See?");
		//Read from the screen
		//You need somewhere to put your info! Use variables
		//State the TYPE of info, then the name. If you want, you can give it a value.
		
		//Numbers without decimals --> int
		int num1 = 0;
		//Numbers with decimals --> double
		double num2 = 0;
		//A single letter or character --> char
		char letter1 = 0;
		//True/false? --> boolean
		boolean flag = false;
		//A sentence, word, characters? --> String
		String sentence = null;
		//Note: String is not primitive! It needs a capital because it is an object!
		System.out.println(num1+"\n"+num2+"\n"+letter1+"\n"+flag+"\n"+sentence);
		//How to fill the info? Simply use the = sign and a value
		num1=5;
		num2=4.32;
		letter1='Z';
		flag=true;
		sentence="Hello Everyone!";
		System.out.println(num1+"\n"+num2+"\n"+letter1+"\n"+flag+"\n"+sentence);
		
		//Let's read in from the screen!
		System.out.println("Give me an integer:");
		//Use your Scanner, call "nextInt()"
		num1=in.nextInt(); //Reads in an integer
		in.nextLine();
		//Read in double, use in.nextDouble()
		System.out.println("Give me a double:");
		num2=in.nextDouble();
		in.nextLine();
		//Read in a character? You can't!! Read in a String using in.nextLine() and
		//take off the first character
		System.out.println("Give me a character");
		letter1=in.nextLine().charAt(0);
		
		//Read in boolean? Nope! Don't bother
		//OR, read in a string and use an if statement
		System.out.println("Give me True or False:");
		String temp=in.nextLine().toLowerCase();
		if (temp.startsWith("t")) {
			flag=true;
		}else {
			flag=false;
		}
		
		//Read in String? in.nextLine();
		System.out.println("Finally, give me a sentence:");
		sentence=in.nextLine();
		System.out.println(num1+"\n"+num2+"\n"+letter1+"\n"+flag+"\n"+sentence);
	}

}
