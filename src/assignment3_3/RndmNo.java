package assignment3_3;

public class RndmNo {

	static String gnrndm(String ino){
		System.out.println("Hello World! This will generate a random number based on "+ino);
		int intno=Integer.parseInt(ino);
		int intno1=intno/7*3;
		String random_no=""+intno1;
		return random_no;
	}
	
	
	public static void main(String[] args) {
	
		//System.out.println("Hello World! This will generate a random number");
		String ino="57";//args[0];
	
		System.out.println("Generated random number : "+gnrndm(ino));
		
	}

}
