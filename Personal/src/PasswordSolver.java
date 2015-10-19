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
				if (words[i].charAt(1) == charTwo[j].charAt(0)){
					for (int k = 0; k < 6; k++){
						if (words[i].charAt(0) == charOne[k].charAt(0)){
							System.out.println(words[i]);
						}
					}
				}
			}				
		}
		
		for (int i  = 0; i < 6; i++){
			charThree[i] = keyboard.next();
		}
		
		for (int i = 0; i < 35; i++){
			for (int l = 0; l < 6; l++){
				if (words[i].charAt(2) == charThree[l].charAt(0)){
					for (int j = 0; j < 6; j++){
						if (words[i].charAt(1) == charTwo[j].charAt(0)){
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
		
		for (int i  = 0; i < 6; i++){
			charFour[i] = keyboard.next();
		}
		
		for (int i = 0; i < 35; i++){
			for (int m = 0; m < 6; m++){
				if (words[i].charAt(3) == charFour[m].charAt(0)){
					for (int l = 0; l < 6; l++){
						if (words[i].charAt(2) == charThree[l].charAt(0)){
							for (int j = 0; j < 6; j++){
								if (words[i].charAt(1) == charTwo[j].charAt(0)){
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
			}
		}
		
		for (int i  = 0; i < 6; i++){
			charFive[i] = keyboard.next();
		}
		
		for (int i = 0; i < 35; i++){
			for (int n = 0; n < 6; n++){
				if (words[i].charAt(4) == charFive[n].charAt(0)){
					for (int m = 0; m < 6; m++){
						if (words[i].charAt(3) == charFour[m].charAt(0)){
							for (int l = 0; l < 6; l++){
								if (words[i].charAt(2) == charThree[l].charAt(0)){
									for (int j = 0; j < 6; j++){
										if (words[i].charAt(1) == charTwo[j].charAt(0)){
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
					}
				}
			}
		}
		System.exit(0);
	}
}
