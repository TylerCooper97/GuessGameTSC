package edu.saintjoe.cs.tcooper.guessgametsc;

public class GuessGameTSC {

	public static void main(String[] args) {
		public class GuessGame {
			Player p1;//3 instance variables for the 3 players
			Player p2;
			Player p3;
			
			public void startGame() {
				p1 = new Player ();//create 3 player objects and assign them to the 3 player instance variables
				p2 = new Player ();
				p3 = new Player ();
				
				int guessp1 = 0;//declare 3 variables to hold the 3 guesses the players make
				int guessp2 = 0;
				int guessp3 = 0;
				
				boolean p1isRight = false;//declare 3 variables to hold true of false based on players answer
				boolean p2isRight = false;
				boolean p3isRight = false;
				
				int targetNumber = (int) (Math.random() * 10);//make a target number that the players have to guess
				System.out.println("I'm thinking of a number between 0 and 9...");
				
				while (true) {
					System.out.println("Number to guess is " + targetNumber);
					
					p1.guess();//call each players guess() method
					p2.guess();
					p3.guess();
					
					guessp1 = p1.number;//get each players guess by accessing the number variable of each player
					System.out.println("Player one guessed " + guessp1);
					
					guessp2 = p2.number;
					System.out.println("Player two guessed " + guessp2);
					
					guessp3 = p3.number;
					System.out.println("Player three guessed " + guessp3);
					
					if (guessp1 == targetNumber) {//check each players guess to see if it matches the target number. if player is right, set that players variable to true
						p1isRight = true;
					}
					if (guessp2 == targetNumber) {
						p2isRight = true;
					}
					if (guessp3 == targetNumber) {
						p3isRight = true;
					}
					}
				}
			if (p1isRight ll p2isRight ll p3isRight) {//if p1 or p2 or p3 is right
				System.out.println("We have a winer!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? "  p3isRight);
				break; //game over, so break out of the loop
				
			} else {
				//we must keep going because nobody got it right
				System.out.println("Players will have to try again.");
			}
		}

	}

}
