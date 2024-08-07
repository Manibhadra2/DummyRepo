package qspider;

import java.util.Scanner;

public class FetchRunrate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter run rate");
		double runrate=s.nextDouble();
		
		int totalover=15;
		
		double totalrunscore = runrate*totalover;
		System.out.println(totalrunscore);
		
	}

}
