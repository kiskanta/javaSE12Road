package ksh.javacoding.ch04StringContaiin;

public class StringContainsOnlyInteger {
	public static boolean containsOnlyDigit(String str){
		for(int i=0; i< str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return false;
	}
	
	public static boolean containsOnlyDigitV2(String str){
		return !str.chars()	//IntStreamObject
				.anyMatch( n-> !Character.isDigit(n));	// 
	}
	
	public static boolean containsOnlyDigitV3(String str) {
		return str.matches("[0-9]+");
	}
	
	public static void main(String[] args) {
		System.out.println(containsOnlyDigit("123K"));
		System.out.println(containsOnlyDigitV2("123K"));
		System.out.println(containsOnlyDigitV3("123K"));
	}
}
