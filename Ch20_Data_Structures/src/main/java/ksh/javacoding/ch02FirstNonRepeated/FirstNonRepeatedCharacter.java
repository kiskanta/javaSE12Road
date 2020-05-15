package ksh.javacoding.ch02FirstNonRepeated;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	private static final int EXTENDED_ASCII_CODES =256;
	private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";
	

    // Ӝ -> Unicode: \u04DC, Code Point: 1244
    // 💕 -> Unicode: \uD83D\uDC95, Code Point: 128149
    private static final String TEXT_CP = "IIllovveeyyoussommucchh";
    
	public char firstNonRepeatedCharacter(String str){
		int[] flags = new int[EXTENDED_ASCII_CODES];
		
		for(int i=0; i<flags.length; i++) {
			flags[i] = -1; 
		}
		
		for(int i=0; i< str.length(); i++) {
			char ch =str.charAt(i);
			
			if(flags[ch] ==-1) {
				flags[ch] = i;
			}else {
				flags[ch] = -2;
			}
		}
		int position = Integer.MAX_VALUE; 
		
		for(int i=0; i< EXTENDED_ASCII_CODES; i++) {
			if(flags[i] >= 0) {
				position = Math.min(position, flags[i]);
			}
		}
		return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
	}
	
	public char firstNonRepeatedCharacterV3(String str){
		var chars = new LinkedHashMap<Character, Integer>();
		
		for(int i =0 ; i< str.length(); i++) {
			char ch =str.charAt(i);
			
			chars.compute(ch, (k, v) -> (v== null) ? 1 : ++v);
		}
		
		for(Map.Entry<Character, Integer> entry : chars.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		
		return Character.MIN_VALUE;
	}
	
	public String firstNonRepeatedCharacterV4(String str){
		Map<Integer, Long> chars = str.codePoints()
			.mapToObj(cp -> cp)
			
			.collect(Collectors.
						groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting())
					);
		
		int cp =chars.entrySet()
			.stream()
			.filter( e -> e.getValue() == 1L)
			.findFirst()
			.map(Map.Entry::getKey)
			.orElse(Integer.valueOf(Character.MIN_VALUE));
		
		return String.valueOf(Character.toChars(cp));
	}
	public static void main(String[] args) {
				
		FirstNonRepeatedCharacter nonRep = new FirstNonRepeatedCharacter();
		System.out.println(nonRep.firstNonRepeatedCharacter(TEXT));
		
		System.out.println(nonRep.firstNonRepeatedCharacterV3(TEXT_CP));
		System.out.println(nonRep.firstNonRepeatedCharacterV4(TEXT_CP));
	}
	
	
}
