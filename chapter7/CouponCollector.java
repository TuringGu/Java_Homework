package chapter7;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:43:23
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 7.24
 */
public class CouponCollector {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		System.out.println("**********Program begin**********");
		int[] deck = initialDeckOfCards();
		shuffleCards(deck);
		int[] suitsTimes = new int[4];    // Calculate the times of each suit
		String[] selectedCard = new String[4];   // The selected four cards
		// Take cards from the deck one by one
		for(int i = 0; i <= deck.length; i++) {
			
			String suitOfCard = getSuit(deck, i);
			
			// selected cards input
			switch(suitOfCard) {
			case "Spades"  : selectedCard[0] = getRank(deck, i); break;
			case "Hearts"  : selectedCard[1] = getRank(deck, i); break;
			case "Diamonds": selectedCard[2] = getRank(deck, i); break;
			case "Clubs"   : selectedCard[3] = getRank(deck, i); break;
			default        : System.out.println("Error: select cards");
			}
			
			suitsCalculate(suitsTimes, suitOfCard);
			if(isSuitsAllShowed(suitsTimes)) {
				break;
			}
		}
		
//		// Output
//		System.out.print(
//				"The time of each suits: \n" +
//				"Spades:          " + suitsTimes[0] + "\n" +
//	 		    "Clubs:           " + suitsTimes[1] + "\n" +
//	 		    "Hearts:          " + suitsTimes[2] + "\n" +
//	 		    "Diamonds:        " + suitsTimes[3] + "\n"
//		);
//		
		System.out.print(
				"The selected four cards with different suits: \n" +
				selectedCard[0] + " of Spades"  + "\n" +
				selectedCard[1] + " of clubs"   + "\n" +
				selectedCard[2] + " of Hearts"  + "\n" +
				selectedCard[3] + " of Diamonds"+ "\n" 
		);
		
		System.out.println("Number of pick: " + (suitsTimes[0] + 	// The sum
				suitsTimes[1] + suitsTimes[2] + suitsTimes[3])); 
	}
	
	
	/** Initial the deck of cards */
	public static int[] initialDeckOfCards() {
		int[] deck = new int[52];
		for(int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		return deck;
	}
	
	
	/** Shuffle the cards */ 
	public static void shuffleCards(int[] deck) {
		for(int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
	}
	
	
	/** Get the suit of the card */
	public static String getSuit(int[] deck, int index) {
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		return suits[deck[index] / 13];
	}
	
	
	/** Get the rank of the card */
	public static String getRank(int[] deck, int index) {
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		return ranks[deck[index] % 13];
	}
	
	
	/** Suits Calculate */
	public static void suitsCalculate(int[] suitsTimes, String suitOfCard) {
		switch(suitOfCard) {
		case "Spades"  : suitsTimes[0]++; break;
		case "Hearts"  : suitsTimes[1]++; break;
		case "Diamonds": suitsTimes[2]++; break;
		case "Clubs"   : suitsTimes[3]++; break;
		default        : System.out.println("Error: suitsCalculate()");
		}
	}
	
	
	/** Judge weather all of the suits have already at 
	 * least have been took out once */
	public static boolean isSuitsAllShowed(int suitsTimes[]) {
		if(suitsTimes[0] > 1 && suitsTimes[1] > 1 && 
				suitsTimes[2] > 1 && suitsTimes[3] > 1) {
			return true;
		}
		else {
			return false;
		}
	}

}
