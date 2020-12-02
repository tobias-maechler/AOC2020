package aoc2020.day2;

public class Test {

	public static void main(String[] args) throws Exception {
		int validPasswords = 0;
		
		try (var reader = new Reader("input.txt")) {
			String[] names;
			
			while ((names = reader.readNextLine()) != null) {
				System.out.println("Policy: " + names[0] + " Password: " + names[1]);
				if (PasswordCheck.TobogganCorporatePolicy(names[0], names[1])) {
					validPasswords++;
				}
			}			

			System.out.println("Valid Passwords: " + validPasswords);
		}
	}

}
