package assignment3_3;

import java.util.Scanner;

public class RndmNo {

	static String gnrndm(String ino){
		//System.out.println("Hello World! This will generate a random number based on "+ino);
		String random_no;
		int intno=Integer.parseInt(ino);
		int intno1=intno/7*3;
		if(intno1<=0){
			random_no="0";
			}else{
				random_no=""+intno1;
		}
		return random_no;
	}
	
	
	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		
		System.out.println("Enter a nmber to generate a random number:");

		String ino=scnr.nextLine();//)="57";//args[0];
	
		System.out.println("Generated random number : "+gnrndm(ino));
		scnr.close();
		
	}

}
