package Level_2;

import java.util.*;

public class DiceGame {
	private static int d1;
	private static int d2;
	private static int userPoints;
	private static int compPoints;
	
	public static void main(String[] args) {
		System.out.println("--- Start game ---");
		System.out.println("Predict amount of points (2..12):");
		
		Scanner scanner = new Scanner(System.in);
		int preNum = scanner.nextInt();		
		
		System.out.println("User rolls the dices...");
		
		DiceGame dice = new DiceGame();
		DiceFace face = new DiceFace();
		
		while (true) {
			//user plays
            d1 = dice.rollTheDice();   
            d2 = dice.rollTheDice();            
            face.printDice(d1);   
            face.printDice(d2);
            int points = d1 + d2;
            System.out.println("On the dice fell " + points + " points");
            userPoints = points - Math.abs(points - preNum)*2;
            System.out.println("Result is " + points + "-abs(" + points + "-" + preNum + ")*2: " + userPoints + " points");
            System.out.println();
            
            //computer plays            
            int compPreNum = dice.compPreNum();
            System.out.println("Computer predicted " + compPreNum + " points. Computer rolls the dices...");
            d1 = dice.rollTheDice();   
            d2 = dice.rollTheDice();            
            face.printDice(d1);   
            face.printDice(d2);
            points = d1 + d2;
            System.out.println("On the dice fell " + points + " points");
            compPoints = points - Math.abs(points - compPreNum)*2;
            System.out.println("Result is " + 
            points + "-abs(" + points + "-" + compPreNum + ")*2: " + compPoints + " points");        
            wins();            
            scanner.close();
            return;
            }
    }
	
	//roll the dice	
	public int rollTheDice() {
		Random r = new Random();
        return r.nextInt(6) + 1;
	}	
	
	public int compPreNum() {
		Random r = new Random();
        return r.nextInt(12) + 1;        
	}
	
	public static void wins() {
		System.out.println();
		int score;
		userPoints = Math.abs(userPoints);
		compPoints = Math.abs(compPoints);
		if (userPoints > compPoints) {
			score = userPoints - compPoints;
			System.out.println("User wins with "+score+" points more. Congratulations!");
		} else if (compPoints == userPoints) {
			System.out.println("It's a tie!");
		} else {
			score =compPoints - userPoints; 
			System.out.println("Computer wins with "+score+" points more. Sorry!");
		}
	}
}
