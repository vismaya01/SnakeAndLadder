import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {
		int playerPosition = 0;
		Random random = new Random();
		int playerRollDie = random.nextInt(6 - 1) + 1;
		int rollDie = random.nextInt(3);
		switch (rollDie) {
			case 0:
 		   		playerPosition = playerPosition + playerRollDie;
 				break;
 			case 1:
 				playerPosition = playerPosition - playerRollDie;
				break;
 			case 2:
 				playerPosition = playerPosition;
 				break;
 			default:
 				break;
 		 	}
	}
}
