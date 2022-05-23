package Level_3;

import java.util.Random;
import java.util.Scanner;

public class Round {

	private static int d1;
	private static int d2;
	public static int userPoints;
	public static int compPoints;	
	public static int uResult;
	public static int cResult;
	public static int uNum;
	public static int cNum;

	Scanner scanner = new Scanner(System.in);	
	Dice dice = new Dice();	
	
	public void play() {
		while (true) {
			//user plays
			System.out.println("Predict amount of points (2..12):");
			uNum = scanner.nextInt();
			System.out.println("User rolls the dices...");
			d1 = dice.rollTheDice();   
			d2 = dice.rollTheDice();            
			dice.printDice(d1);   
			dice.printDice(d2);
			userPoints = d1 + d2;			
			System.out.println("On the dice fell " + userPoints + " points");
			uResult = userPoints - Math.abs(userPoints - uNum)*2;
			System.out.println("Result is " + userPoints + "-abs(" + userPoints + "-" + uNum + ")*2: " + uResult + " points");
			System.out.println();		

			//computer plays            
			cNum = compPreNum();
			System.out.println("Computer predicted " + cNum + " points. Computer rolls the dices...");
			d1 = dice.rollTheDice();   
			d2 = dice.rollTheDice();            
			dice.printDice(d1);   
			dice.printDice(d2);
			compPoints = d1 + d2;
			System.out.println("On the dice fell " + compPoints + " points");
			cResult = compPoints - Math.abs(compPoints - cNum)*2;
			System.out.println("Result is " + 
					compPoints + "-abs(" + compPoints + "-" + cNum + ")*2: " + cResult + " points");
			return;
		}	
	}	
	
	public int compPreNum() {
		Random r = new Random();
        return r.nextInt(12) + 1;        
	}
	public void currentScore() {
		System.out.println();
		System.out.println("---------- Current score ---------");		
		int score;
		uResult = Math.abs(uResult);
		cResult = Math.abs(cResult);
		System.out.println("User: " + uResult + " points");
		System.out.println("Computer: " + cResult + " points");
		if (uResult > cResult) {
			score = uResult - cResult;
			System.out.println("User's ahead by "+score+" points!");
		} else if (cResult == uResult) {
			System.out.println("It's a tie!");
		} else {
			score =cResult - uResult; 
			System.out.println("Computer's ahead by "+score+" points!");
		}
		System.out.println("----------------------------------");
	}
}




