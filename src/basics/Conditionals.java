package basics;
import java.util.*;
public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		/*
		 * Conditionals with numbers
		 * Comparing ints, doubles, chars, we can use these comparisons
		 * == equal
		 * > greater than
		 * >= greater than equal
		 * < less than
		 * <= less than equal
		 * != not equal
		 */
		
//		System.out.println("Give me a number:");
//		int num1=in.nextInt();
//		System.out.println("Give me a second number:");
//		int num2=in.nextInt();
//		in.nextLine();
//		//Check which is higher and print it out. Use if statements!
//		
//		if (num1>num2) {
//			System.out.println(num1+" is higher than "+num2);
//		}else if (num1<num2) {
//			System.out.println(num1+" is less than "+num2);
//			//This only runs IF the first condition is false AND the second condition is true
//		}else {
//			System.out.println("They are equal!");
//			//This runs IF every other condition is false
//		}
		char bell=(char)7;
		System.out.println(bell);
		System.out.println("Give me a letter");
		char let1=in.nextLine().charAt(0);
		System.out.println("Give me another letter");
		char let2=in.nextLine().charAt(0);
		
		if (let1>let2) {
			System.out.println(let1+" is greater than "+let2);
		}else if (let1<let2){
			System.out.println(let1+" is less than "+let2);
		}else {
			System.out.println("They are the same letter");
		}
		int l1=(int)let1;
		int l2=(int)let2;
		System.out.println(let1+" is "+l1);
		System.out.println(let2+" is "+l2);
		
		
		//Tertiary if statement!
		//This takes 3 fields: Condition?trueResult:falseResult
		
		System.out.println("You entered a "+(let1>='A'&&let1<='Z'?"capital ":"lowercase ")+"letter");
	}

}
