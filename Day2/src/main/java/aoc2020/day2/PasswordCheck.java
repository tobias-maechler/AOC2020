package aoc2020.day2;

public class PasswordCheck {
	
	public static boolean SledRentalPolicy(String input, String password) {
		String[] split = input.split("-| ");
		char c=split[2].charAt(0);
		
		long count = password.chars().filter(ch -> ch == c).count();
		
		if (count >= Integer.parseInt(split[0]) && count <= Integer.parseInt(split[1])) {
			System.out.println("Is in range");
			return true;
		} else {
			System.out.println("Is not in range");
			return false;
		}	
	}
	
	public static boolean TobogganCorporatePolicy(String input, String password) {
		String[] split = input.split("-| ");
		char c=split[2].charAt(0);
		
		if (password.charAt(Integer.parseInt(split[0])-1) == c) {
			if (password.charAt(Integer.parseInt(split[1])-1) == c) {
				System.out.println("Password is invalid");
				return false;
			}
			System.out.println("Password is valid");
			return true;
		} else if (password.charAt(Integer.parseInt(split[1])-1) == c) {
			if (password.charAt(Integer.parseInt(split[0])-1) == c) {
				System.out.println("Password is invalid");
				return false;
			}
			System.out.println("Password is valid");
			return true;
		}	else {
			System.out.println("Password is invalid");
			return false;
		}
	}

}
