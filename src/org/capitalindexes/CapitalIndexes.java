package org.capitalindexes;

import java.util.ArrayList;
import java.util.List;

public class CapitalIndexes {
	public static List<Integer> capitalIndexes(String str) {
        List<Integer> indexes = new ArrayList<>();
        for (int i=0; i<str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                indexes.add(i);
            }
        }
        return indexes;
    }
	public static void main(String[] args) {
		String input = "HeLlO";
        List<Integer> result = capitalIndexes(input);
        System.out.println("Capital Indexes of word HeLlO is : "+result);
	}

}
