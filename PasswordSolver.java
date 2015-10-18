import java.util.Scanner;

public class PasswordSolver {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		
		String[] charOne = new String[6];
		String[] charTwo = new String[6];
		String[] charThree = new String[6];
		String[] charFour = new String[6];
		String[] charFive = new String[6];
		
		String[] words = {"about", "after", "again", "below", "could", "every", "first", "found", "great", "house", "large", "learn", "never", "other",
				"place", "plant", "point", "right", "small", "sound", "spell", "still", "study", "their", "there", "these", "thing", "think", "three",
				"water", "where", "which", "world", "would", "write"};
		
		for (int i  = 0; i < 6; i++){
			charOne[i] = keyboard.next();
		}
		
		for (int i = 0; i < 35; i++){
			for (int j = 0; j < 6; j++){
				if (words[i].charAt(0) == charOne[j].charAt(0)){
					System.out.println(words[i]);
				}
			}				
		}
		
		for (int i  = 0; i < 6; i++){
			charTwo[i] = keyboard.next();
		}
		
		for (int i = 0; i < 35; i++){
			for (int j = 0; j < 6; j++){
				if (words[i].charAt(1) == charOne[j].charAt(0)){
					for (int k = 0; k < 6; k++){
						if (words[i].charAt(0) == charOne[k].charAt(0)){
							System.out.println(words[i]);
						}
					}
				}
			}				
		}
	}
}
