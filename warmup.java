package day2;

import java.util.Scanner;

public class warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cool= new Scanner(System.in);
		System.out.println("Name:");
		cool.nextLine();//string
		System.out.println("Age:");
		cool.nextInt();//integer
		System.out.println("Favorite color:");
		cool.next();//string
		System.out.println("best number:");
		cool.nextInt();//integer
		System.out.println("Thank user for the partipation");
		cool.close(); 
	}

}
