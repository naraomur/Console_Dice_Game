package Level_4;

import java.util.Random;

public class Dice {
	//face configuration
	private int[][][] diceFace = { { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }, 
			{ { 0, 0, 1 }, { 0, 0, 0 }, { 1, 0, 0 } },
			{ { 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }, 
			{ { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } },
			{ { 1, 0, 1 }, { 0, 1, 0 }, { 1, 0, 1 } }, 
			{ { 1, 0, 1 }, { 1, 0, 1 }, { 1, 0, 1 } } };

	//draw and print the dice face
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
