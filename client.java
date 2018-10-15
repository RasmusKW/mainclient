package miniProjectClient;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		
		// If the game runs
		boolean keepRunning = true;
		
		// Scanner for start game
		Scanner inputStartGame = new Scanner(System.in);
		
		while(keepRunning) {
			try {
				DataOutputStream toServer = null;
				DataInputStream fromServer = null;
				
				
				
				// Enter if you want to start the game
				System.out.print("Do you want to start a game of rock, paper scissors?: ");
				String wanttostartgame = inputStartGame.toString();
				String answerStartGame = inputStartGame.next();
				if ( answerStartGame.equalsIgnoreCase("no")) {
					keepRunning = false;
				}
				else {
					continue;
				}
				inputStartGame.close();
			
			}
			
		catch(IOException e) {
			
		}
			
		}
	}
}
