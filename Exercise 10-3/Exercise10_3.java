/*
Author: Kellen Nankervis
Date: 8/4/2021

This program calls the MyInteger.java class and builds the MyInteger object. Then it runs a bunch of tests on some test data to see if every thing is working correctly.
*/

class Exercise10_3 {
	public static void main(String[] args) {
		//Make some test values and put them in an array.
		int[] testValues = {5, 25, 7, 2021, 97, 816, 357, 492, 620, 2, 247};
		
		//Start Testing
		System.out.println("\nTest if the values are even:");
		for (int i = 0; i < testValues.length; i++){
			System.out.println(testValues[i] + " " + MyInteger.isEven(testValues[i]));
		}
		
		System.out.println("\nTest if the values are even:");
		for (int i = 0; i < testValues.length; i++) {
			MyInteger intValue = new MyInteger(testValues[i]);
			System.out.println(intValue.getValue() + " " + intValue.isEven());
		}
		
		System.out.println("\nTest if the values are even:");
		for (int i = 0; i < testValues.length; i++) {
			MyInteger intValue = new MyInteger(testValues[i]);
			System.out.println(intValue.getValue() + " " + MyInteger.isEven(intValue));
		}		
		
		System.out.println("\nTest if the values are odd:");
		for (int i = 0; i < testValues.length; i++) {
			System.out.println(testValues[i] + " " + MyInteger.isOdd(testValues[i]));
		}
		
		System.out.println("\nTest if the values are odd:");
		for (int i = 0; i < testValues.length; i++) {
			MyInteger intValue = new MyInteger(testValues[i]);
			System.out.println(intValue.getValue() + " " + intValue.isOdd());
		}
		
		System.out.println("\nTest if the values are odd:");
		for (int i = 0; i < testValues.length; i++) {
			MyInteger intValue = new MyInteger(testValues[i]);
			System.out.println(intValue.getValue() + " " + MyInteger.isOdd(intValue));
		}		
		
		System.out.println("\nTest if the values are prime:");
		for (int i = 0; i < testValues.length; i++) {
			System.out.println(testValues[i] + " " + MyInteger.isPrime(testValues[i]));
		}
		
		System.out.println("\nTest if the values are prime:");
		for (int i = 0; i < testValues.length; i++) {
			MyInteger intValue = new MyInteger(testValues[i]);
			System.out.println(intValue.getValue() + " " + intValue.isPrime());
		}
		
		System.out.println("\nTest if the values are prime:");
		for (int i = 0; i < testValues.length; i++) {
			MyInteger intValue = new MyInteger(testValues[i]);
			System.out.println(intValue.getValue() + " " + MyInteger.isPrime(intValue));
		}
		
		int[] testValues2 = {4, 9, 6};
		MyInteger intValue = new MyInteger(9);
		System.out.println("\nTest if " + intValue.getValue() + 
			" is equal to the specified value:");
		for (int i = 0; i < testValues2.length; i++) {
			System.out.println(testValues2[i] + " " + intValue.equals(testValues2[i]));
		}

		System.out.println("\nTest if " + intValue.getValue() + 
			" is equal to the specified value:");
		for (int i = 0; i < testValues2.length; i++) {
			MyInteger myInteger = new MyInteger(testValues2[i]);	
			System.out.println(testValues2[i] + " " + intValue.equals(myInteger));
		}
		
		System.out.println("\nTest parseInt(char[]) and parseInt(String):");
		char[] numberCharacters = {'4', '5', '6'};

		String numberString = "8347";
		System.out.print("\'");
		for (int i = 0; i < numberCharacters.length; i++) {
		 	System.out.print(numberCharacters[i] + "");
		} 
		System.out.println("\' + \"" + numberString + "\" = " + 
			(MyInteger.parseInt(numberCharacters) + 
			MyInteger.parseInt(numberString)));
	}
}