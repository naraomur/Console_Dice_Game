package Level_4;

public class Scores {
	
	public static void display() {
		Round round = new Round();
		System.out.println("--- Start game ---");	
		System.out.println("----- Round 1 -----");
		round.play();
		round.currentScore();
		int roundNum = Round.uNum;
		int roundUserPoint = Round.userPoints;
		int roundUserResult = Round.uResult;
		int roundCompNum = Round.cNum;
		int roundCompPoint = Round.compPoints;
		int roundCompResult = Round.cResult;
		System.out.println("----- Round 2 -----");
		round.play();
		round.currentScore();
		int round2Num = Round.uNum;
		int round2UserPoint = Round.userPoints;
		int round2UserResult = Round.uResult;
		int round2CompNum = Round.cNum;
		int round2CompPoint = Round.compPoints;
		int round2CompResult = Round.cResult;
		System.out.println("----- Round 3 -----");
		round.play();
		int round3Num = Round.uNum;
		int round3UserPoint = Round.userPoints;
		int round3UserResult = Round.uResult;
		int round3CompNum = Round.cNum;
		int round3CompPoint = Round.compPoints;
		int round3CompResult = Round.cResult;
		System.out.println();
		System.out.println("-------------- Finish game --------------");
		System.out.println();
		System.out.println("Round    |   User   |   Computer");
		System.out.println("-------+----------------+----------------");
		System.out.println(" | Predicted: " + roundNum + " | Predicted: " + roundCompNum);
		System.out.println("- 1 - | Dice: " + roundUserPoint + " | Dice: " + roundCompPoint);
		System.out.println(" | Result: " + roundUserResult + " | Result: " + roundCompResult);
		System.out.println("-------+----------------+----------------");
		System.out.println(" | Predicted: " + round2Num + " | Predicted: " + round2CompNum);
		System.out.println("- 2 - | Dice: " + round2UserPoint + " | Dice: " + round2CompPoint);
		System.out.println(" | Result: " + round2UserResult + " | Result: " + round2CompResult);
		System.out.println("-------+----------------+----------------");
		System.out.println(" | Predicted: " + round3Num + " | Predicted: " + round3CompNum);
		System.out.println("- 2 - | Dice: " + round3UserPoint + " | Dice: " + round3CompPoint);
		System.out.println(" | Result: " + round3UserResult + " | Result: " + round3CompResult);
		System.out.println("-------+----------------+----------------");
		int uScore = roundUserResult + round2UserResult + round3UserResult;
		int cScore = roundCompResult + round2CompResult + round3CompResult;
		System.out.println("Total | Points: " + uScore + " | Points: " + cScore);
		if (uScore > cScore) {
			System.out.println();
			System.out.println("User wins with " + uScore + " points more. Congratulations!");
		} else if (uScore == cScore) {
			System.out.println();
			System.out.println("It's a tie! User: " + uScore + " Computer: " + cScore);
		} else {
			System.out.println();
			System.out.println("Computer wins with " + cScore + " points more. Sorry!");
		}
	}	

}
