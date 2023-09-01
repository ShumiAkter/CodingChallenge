package codeChallengeing;

import java.util.Arrays;

public class ChallengingCode {
	public static void main(String[] args) {
		
		String s1 ="Hello";//4 {'h', 'e', 'l', 'l', '0'}
		for ( int i=s1.length()-1; i>=0; i--) {
			System.out.println(s1.toCharArray());
		//s1.charAt(0);
		
		}
		
		//i =4 ; i <=  0; 3210-1-2-3.............
		for (int i = s1.length()-1; i >=0 ; i--) {
			char[] sArr = s1.toCharArray();//"hello"  --> {'h', 'e', 'l', 'l', '0'} // whole string to char array.
		System.out.print(sArr[i]);
	
		}
		
	 System.out.println(",,,,,,,,,,,,,,,,,");
		for (int i = s1.length()-1; i>=0  ; i--) {
			//System.out.println(s1.toCharArray());
			// imran --> "n"1
			
			s1.charAt(i);
			System.out.print(s1.charAt(i)); // bring index to do char( character) 
			
		
		}
	

	
	
	
	 
	//8 / 2 == 4
	
	
	
	
	
	
//	for(int i=1; i<=100; i++) { // we seeting the rang for our loof
//		
//	
//	if (i%2 == 0) {// checking even or odd number 
//		if(i >= 8) { //checking if the number getter than 8
//			System.out.println(i); 
//		}
//	}
//	
//
//	}
}

	
}
