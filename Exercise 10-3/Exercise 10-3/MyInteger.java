/*
Author: Kellen Nankervis
Date: 8/4/2021

This is the class that creates the object MyInteger
*/

public class MyInteger {
	private int value;
		
	MyInteger(int value) {
		this.value = value;	
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isEven(){
		return isEven(value);
	}
	
	public static boolean isEven(int value){
			return value % 2 == 0;
	}
	
	public static boolean isEven(MyInteger i){
		return i.isEven();
	}	
	
	public boolean isOdd(){
		return isOdd(value);
	}
	
	public static boolean isOdd(int value){
		return value % 2 != 0;
	}
	
	public static boolean isOdd(MyInteger i){
		return i.isOdd();
	}
	
	public boolean isPrime(){
		return isPrime(value);
	}
	
	public static boolean isPrime(int value){
		for(int n = 2; n <= Math.sqrt(Double.valueOf(value)); n++){
			if(value % n == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime(MyInteger i){
		return i.isPrime();
	}
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public boolean equals(MyInteger i) {
		return i.value == this.value;
	}
	
	public static int parseInt(char[] c) {
		int value = 0;
		for (int n = 0, k = (int)Math.pow(10, c.length - 1); n < c.length; n++, k /= 10) {
			value += (c[n]- 48) * k;
		}
		return value;
	}
	
	public static int parseInt(String s){
		int value = 0;
		for(int n = 0, k = (int)Math.pow(10, s.length() - 1); n < s.length(); n++, k /= 10) {
			value += (s.charAt(n) - 48) * k;
		}
		return value;
	}
}