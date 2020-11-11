import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {
		int playerPosition = 0;
		int count = 0;
		Random random = new Random();
        	 while (playerPosition < 100) {                  
        		int playerRollDie = random.nextInt(6 - 1) + 1;
        		System.out.println(playerRollDie);
        		count = count + 1;
 		 	int rollDie = random.nextInt(3);
 		 	System.out.println("roll="+rollDie);
 		 	switch (rollDie) {
 		   		case 0:
 		   			playerPosition = playerPosition + playerRollDie;
 		  			if (playerPosition > 100){
 	  					playerPosition=playerPosition-playerRollDie;
 	   				}
 	  				System.out.println("player position is " +playerPosition);
 					break;
 		   		case 1:
 					playerPosition = playerPosition - playerRollDie;
 					if (playerPosition <= 0 ) {
 						System.out.println("player position is 0" );
 						SnakeAndLadder.main(args);
		 			}
 					System.out.println("player position is " +playerPosition);
 					break;
 		   		case 2:
 					System.out.println("player position is " +playerPosition);
 					break;
				default:
 					break;
 	 		}
 			if (playerPosition == 100) {
 				System.out.println("you won the game");
 				System.out.println("the number of time dice rolled is "+count);
 				System.exit(0);
 			}
         	}
	}
}
