package aoc2020.day2;

public class PasswordCheck {
	
	public static boolean Valid(String input, String password) {
		
		String[] split = input.split("-| ");
		//System.out.println(split[0]);
		//System.out.println(split[1]);
		//System.out.println(split[2]);
		char c=split[2].charAt(0);
		
		long count = password.chars().filter(ch -> ch == c).count();
		//System.out.println(count);
		
		if (count >= Integer.parseInt(split[0]) && count <= Integer.parseInt(split[1])) {
			System.out.println("Is in range");
			return true;
		} else {
			System.out.println("Is not in range");
			return false;
		}
		
		
		
	}

}
