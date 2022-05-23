package Level_1;

import java.util.*;

public class DiceGame {
	
	private int[][][] diceFace = { { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }, 
            { { 0, 0, 1 }, { 0, 0, 0 }, { 1, 0, 0 } },
            { { 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }, 
            { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } },
            { { 1, 0, 1 }, { 0, 1, 0 }, { 1, 0, 1 } }, 
            { { 1, 0, 1 }, { 1, 0, 1 }, { 1, 0, 1 } } };
	
	public static void main(String[] args) {
		System.out.println("--- Start game ---");
		System.out.println("Predict amount of points (2..12):");
		Scanner scanner = new Scanner(System.in);
		int preNum = scanner.nextInt();		
		System.out.println("User rolls the dices...");
		DiceGame dice = new DiceGame();
		while (true) {
            int d1 = dice.rollTheDice();   
            int d2 = dice.rollTheDice();
            dice.printDice(d1);   
            dice.printDice(d2);
            int points = d1 + d2;
            System.out.println("On the dice fell " + points + " points");
            int result = points - Math.abs(points - preNum)*2;
            if (result > 0) {
            	System.out.println("Result is " + points + "-abs(" + points + "-" + preNum + ")*2: " + result + " points User wins!");
            } else {
            	System.out.println("Result is " + points + "-abs(" + points + "-" + preNum + ")*2: " + result + " points User looses!");
            }
            scanner.close();
            return;
            }
    }
	
	
	//draw the dice face
	public void printDice(int n) {
		int[][] display = diceFace[n - 1];
        System.out.println("+-----+");
 
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                if (display[i][j] == 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        System.out.println("+-----+"); 
	}
	//roll the dice
	
	public int rollTheDice() {
		Random r = new Random();
        return r.nextInt(6) + 1;
	}	
}
