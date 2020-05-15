package ksh.javacoding.ch01CountDuplicate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * Program for Counting the characters in a string. During the counting state is maintained via a numeric counter that's increased by one each time the current character is found.  
 * @author KingShore
 *
 */
public class CountingDuplicate {
	
	public Map<Character, Integer> duplicateCount1(String str){
		if(str== null) {
			throw new IllegalArgumentException("Given String is Null or Empty");
		}
		var coutResult = new HashMap<Character, Integer>();
		
		for(int i=0; i< str.length(); i++) {
			if(coutResult.containsKey(str.charAt(i))) {
				coutResult.put(str.charAt(i), coutResult.get(str.charAt(i))+1);
			}else {
				coutResult.put(str.charAt(i), 1);
			}
		}
		
		return coutResult;
	}
	
	public Map<String, Integer> duplicateCount2(String str){
		if(str== null) {
			throw new IllegalArgumentException("Given String is Null or Empty");
		}
		var coutResult = new HashMap<String, Integer>();
		
		for(int i=0; i< str.length(); i++) {
			int cp = str.codePointAt(i);
			String ch = String.valueOf(Character.toChars(cp));
			
			if(Character.charCount(cp) == 2) {
				i++;
			}
			coutResult.compute(ch, (k, v) -> (v== null) ?1 : ++v);
		}
		
		return coutResult;
	}
	
	public Map<Character, Integer> duplicateCount3(String str){
		if(str == null || str.isBlank()) {
			return Collections.emptyMap();
		}
		
		var countMap = new HashMap<Character, Integer>();
		
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			
			countMap.compute(ch, (k, v) -> (v== null)? 1 : ++v);
		}
		
		return countMap;
	}
	
	/**
	 * 1. Call the String.chars() method on the original string. This will return IntStream. This IntStream contains an integer representation of the characters from the given string.<br/>
	 * 2. Transform IntStream into a stream of characters via the mapToObj() method (convert the integer representation into the human-friendly character form).<br/>
	 * 3. Finally, group the characters (Collectors.groupingBy()) and count them (Collectors.counting()).<br/>
	 * @param str
	 * @return
	 */
	public Map<Character, Long> duplicateCount4(String str){
		if(str == null || str.isBlank()) {
			return Collections.emptyMap();
		}
		
		var countMap = str.chars()	// Will handle only ASIC character. 
				.mapToObj(c-> (char) c)
		.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		return countMap;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public Map<String, Long> duplicateCharacterVCP(String str){
		if(str == null || str.isBlank()) {
			return Collections.emptyMap();
		}
		
		var dupCountMap = str.codePoints()	// To handle UniCode character. 
				.mapToObj(c -> String.valueOf(Character.toChars(c)))	// 
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())); 
		
		return dupCountMap;
	}
}
