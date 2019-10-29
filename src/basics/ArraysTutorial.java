package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names;
		System.out.println("How many people are in your class?");
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		in.nextLine();
		names=new String[size];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter a name: ");
			names[i] = in.nextLine();
		}
		Arrays.sort(names);
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j]);
		}
	}

}
