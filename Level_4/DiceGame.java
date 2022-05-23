package Level_4;

import java.io.IOException;
import java.util.*;

public class DiceGame {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scores.display();
		while(true) {
			System.out.println("Do you want  to play one more time (Y/N)");
			Scanner scan = new Scanner(System.in);
			String answer = scan.nextLine();
			answer.toUpperCase();		
			if (answer.equals("Y")) {			
				clear(); 	
				Scores.display();
			} else {
				scan.close();
				return;
			}
			scan.close();
		}
	}		
	public static void clear() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
}	