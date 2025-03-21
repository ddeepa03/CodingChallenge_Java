package org.middleletter;

public class MiddleLetter {
	public static String mid(String str) {
        int length = str.length();
        if (length%2 == 0) {
            return ""; 
        } else {
            int midIndex = length/2; 
            return String.valueOf(str.charAt(midIndex));
        }
	}
	public static void main(String[] args) {
		System.out.println("Middle Letter of abc is : "+mid("abc"));   
        System.out.println("Middle Letter of aaaa is : "+mid("aaaa"));  
        System.out.println("Middle Letter of deepa is : "+mid("deepa")); 
        System.out.println("Middle Letter of note is : "+mid("note"));
	}

}
