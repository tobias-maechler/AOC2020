package aoc2020.day1;

import java.util.ArrayList;

public class Sumup {

	public static void main(String[] args) throws Exception {
		// Sample code to illustrate how the CatalogueReader could be used:
		ArrayList<Integer> inputNumbers = new ArrayList<>();
		
		try (var reader = new Reader("input.txt")) {
			String[] names;
			while ((names = reader.readNextLine()) != null) {
				inputNumbers.add(Integer.parseInt(names[0]));
			}
		}
		
		for(int i = 0; i < inputNumbers.size(); i++) {   
		    //System.out.println(inputNumbers.get(i));
		    for (int l = 0; l < inputNumbers.size(); l++) {
		    	for (int k = 0; k < inputNumbers.size(); k++) {
		    		if (inputNumbers.get(i) + inputNumbers.get(l) + inputNumbers.get(k) == 2020){
				    	System.out.println(inputNumbers.get(i) * inputNumbers.get(l) * inputNumbers.get(k));
				    	System.out.println(inputNumbers.get(i));
				    	System.out.println(inputNumbers.get(l));
				    	System.out.println(inputNumbers.get(k));
				    }
		    	}
		    }
		}  
	}
}
