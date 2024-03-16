package javaFinalCodingProject;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		Player playerOne = new Player("Player 1");
		Player playerTwo = new Player("Player 2");
		
		deck.shuffle();
		
		
		String hLine = "---------------------------------------------";
		
		//dealing cards to players' hands
		for (int i = 0; i<52; i++) {
			if (i%2 == 0) {
				playerOne.draw(deck);
			} else {
				playerTwo.draw(deck);
			}
		}
		
		System.out.println("The cards have been dealt...");
		
		System.out.println(hLine);
		
		for (int i = 0; i < 26; i ++) {
			
			System.out.println(hLine);
			System.out.println("Turn " + (i+1));
			System.out.println();
			
			playRound(playerOne, playerTwo);
			
			System.out.println(hLine);
		}
		
		//Prints final score
		System.out.println(hLine);
		System.out.println("                Final score:");
		printScore(playerOne,playerTwo);
		System.out.println();
		
		//Checks Winner
		if (playerOne.score > playerTwo.score) {
			System.out.println("               " + playerOne.name + " wins!");
		} else if (playerTwo.score > playerOne.score) {
			System.out.println("               " + playerTwo.name + " wins!");
		} else {
			System.out.println("                It's a draw!");
		}
		
		
		
		
	}
	
	public static void playRound(Player p1, Player p2) {
		Card p1Card = p1.flip();
		Card p2Card = p2.flip();
		
		System.out.println("    " + p1.name + " flipped " + p1Card.description());
		System.out.println("and " + p2.name + " flipped " + p2Card.description());
		System.out.println();
		
		if (p1Card.value > p2Card.value) {
			p1.incrementScore();
			System.out.println("        " + p1.name + " received a point!");
			System.out.println();
			printScore(p1,p2);
		} else if (p2Card.value > p1Card.value) {
			p2.incrementScore();
			System.out.println("        " + p2.name + " received a point!");
			System.out.println();
			printScore(p1,p2);
		} else {
			System.out.println("        It's a draw! No points given.");
			System.out.println();
			printScore(p1,p2);
		}
		
	}
	
	public static void printScore(Player p1, Player p2) {
		System.out.println("    " + p1.name + ": " + p1.score + " pts vs "
								  + p2.name + ": " + p2.score + " pts");
	}
	
	
}
