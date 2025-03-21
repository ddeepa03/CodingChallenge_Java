package org.countingsyllables;

public class CountingSyllables {
	 public static int count(String word) {
		 if (word == null || word.isEmpty()) {
	            return 0;
	        }
		return word.split("-").length;
	        
	 }
	 public static void main(String[] args) {
		 System.out.println("Syllable count of the word ho-tel is : "+count("ho-tel")); 
	     System.out.println("Syllable count of the word cat is : "+count("cat")); 
	     System.out.println("Syllable count of the word met-a-phor is : "+count("met-a-phor"));
	     System.out.println("Syllable count of the word ter-min-a-tor is : "+count("ter-min-a-tor"));
	}

}
