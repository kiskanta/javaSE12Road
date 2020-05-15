package ksh.javacoding.ch03StirngReverse;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringReverse {
	public static String strRever(String str) {
		String[] strArra = str.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for(String str1 : strArra) {
			StringBuffer sub = new StringBuffer();
			for(int i=str1.length()-1; i>=0; i--) {
				sub.append(str1.charAt(i));
			}
			sb.append(sub).append(" ");
		}
		return sb.toString();
	}
	
	public static String stringReverse(String str){
		return new StringBuffer(str).reverse().toString();
	}
	
	public static String stringReverseV3(String str){
		 Pattern pattern = Pattern.compile(" +");
		 return pattern.splitAsStream(str)
		 	.map(w -> new StringBuffer(w).reverse())
		 	.collect(Collectors.joining(" "));
	}
	
	public static void main(String[] args) {
		System.out.println(strRever("Hello world Man"));
		System.out.println(stringReverse("Hello world Man"));
		System.out.println(stringReverseV3("Hello world Man"));
	}
}
