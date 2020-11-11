import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int player1Position = 0;
		int player2Position = 0;
		int count = 0;
		Random random = new Random();
		while(true) {
			while (player1Position < 100) {                  
				int rollDie = random.nextInt(3);
				int player1RollDie = random.nextInt(6 - 1) + 1;
				count = count + 1;
				switch (rollDie) {
 		   			case 0:
 		   				player1Position = player1Position + player1RollDie;
 		   				if (player1Position > 100){
 		   					player1Position=player1Position-player1RollDie;
 		   				}
 		   				System.out.println("player one position is " +player1Position);
 		   				break;
 		   			case 1:
 		   				player1Position = player1Position - player1RollDie;
 		   				if (player1Position <= 0 ) {
 		   					System.out.println("player one position is 0" );
 		   					player1Position=0;
 		   				}
 		   				System.out.println("player one position is " +player1Position);
 		   				break;
 		   			case 2:
 		   				System.out.println("player one position is " +player1Position);
 		   				break;
 		   			default:
 		   				break;
				}
				if (player1Position == 100) {
					System.out.println("player one won the game");
					System.out.println("the number of time dice rolled is "+count);
					System.exit(0);
				}
				if(rollDie == 0) {
					continue;
				}
				break;
			}
			while (player2Position < 100) {                  
				int rollDie = random.nextInt(3);
				int player2RollDie = random.nextInt(6 - 1) + 1;
				count = count + 1;
				switch (rollDie) {
 		   			case 0:
 		   				player2Position = player2Position + player2RollDie;
 		   				if (player2Position > 100){
 		   					player2Position=player2Position-player2RollDie;
 		   				}
 		   				System.out.println("player two position is " +player2Position);
 		   				break;
 		   			case 1:
 		   				player2Position = player2Position - player2RollDie;
 		   				if (player2Position <= 0 ) {
 		   					System.out.println("player two position is 0" );
 		   					player2Position=0;
 		   				}
 		   				System.out.println("player two position is " +player2Position);
 		   				break;
 		   			case 2:
 		   				System.out.println("player two position is " +player2Position);
 		   				break;
 		   			default:
 		   				break;
				}
				if (player2Position == 100) {
					System.out.println("player two won the game");
					System.out.println("the number of time dice rolled is "+count);
					System.exit(0);
				}
				if(rollDie == 0) {
					continue;
				}
				break;
			}
		}
	} 
}
