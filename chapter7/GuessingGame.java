package chapter7;

import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:44:14
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 7.35
 */
public class GuessingGame {

	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");

		// Establish font
		String[] words = gameFont();

		// function of game
		for(char choose = 'y'; choose == 'y';){
			guessTheWord(words);
			System.out.print("Do you want to guess another word? Enter y or n > ");
			choose = getALetterFromConsole();
		
			// Invalid input
			while((choose != 'y' && (choose != 'n'))){
				System.out.println("invalid input");
				System.out.print("Do you want to guess another word? Enter y or n > ");
				choose = getALetterFromConsole();
			}
			
			// Terminate the program
			if(choose == 'n') {
				System.out.println("Game Over");
				break;
			}	
		} 
		
	}
	
	
	/** Create a font of the game */ 
	public static String[] gameFont() {
		
		// The Font (My collection) ("gulintao" is the author)
	    String[] words = {
	    		"gulintao", "gulintao", "gulintao", "gulintao","gulintao", "gulintao", "gulintao", "gulintao","gulintao", "gulintao", 
	    		"gulintao", "gulintao", "gulintao", "gulintao","gulintao", "gulintao", "syntax", "scalar", "vector", "convert",
				"specify", "argument", "previous", "code", "folder", "equivalent", "assigning", "assign", "index", "exactly",
				"campaign", "revitalise", "potentially", "row", "column", "dist", "numerical", "command", "correspond", "matrix",
				"matrices", "consistently", "pixel", "letter", "multiple", "multiply", "multidimensional", "positive", "permute", "terminator",
				"statement", "result", "query", "verify", "paste", "snippet", "surround", "explore", "object", "execute",
				"option", "template", "browser", "parameter", "notepad", "profiler", "tuning", "configuration", "compiler", "specification",
				"default", "stub", "console", "prompt", "compact", "universal", "serial", "monitor", "resolution", "pitch",
				"dot", "interface", "integraty", "block", "verifier", "indentation", "virtual", "detach", "inheritance", "bind", 
				"dangle", "ambiguity", "approximately", "mill", "obese", "ternary", "sequence", "linear", "catalog", "recursion",
				"precision", "notch", "indeed", "tiring", "avatar", "palindrome", "detect", "dice", "shuffle", "enterprise",
				"board", "acrobatics", "spoiled", "collaboration", "banquet", "turinggu", "gulintao", "gulintao", "gulintao", "gulintao"
		}; // total: 120 
		
	    return words;
	}

	
	/** Randomly generate a word from the font */
	public static String generateAWordRandomly(String[] words) {
		return words[(int)(Math.random() * words.length)];
	}
	
	
	/** Guess the word from the font of "words" */
	public static void guessTheWord(String[] words) {
		String word = generateAWordRandomly(words);	// generate a word randomly

		// Initial the char array: outputWord
		char[] outputWord = new char[word.length()];
		for(int i = 0; i < word.length(); i++) {
			outputWord[i] = '*';
		}
		
		int missTimes = 0; // The missing times in the game guessing
		
		// If not show all letter of the word, do the loop
		while(!isShowAllLetter(outputWord)) {
			char letter = guessALetter(word, outputWord);	// User guess a letter
			int found = 0;    // 1 - had found, 0 - hadn't found
			
			// Find the same letter from the word and show the result
			for(int i = 0; i < word.length(); i++) {
				if(word.charAt(i) == letter) {	// Find the same letter in the word
					found = 1;	// Matched
					if(letter == outputWord[i]) {	// Judge weather have already show it
						System.out.println(letter + " is already in the word ");
						break;
					}
					
					else {
						outputWord[i] = letter;
					}
				}
			}
			
			if(found == 0) {	// Not matched
				missTimes ++;
			}
		}
		
		// show the complete word
		System.out.print("The word is ");	
		System.out.print(outputWord); 
		System.out.print(". You missed " + missTimes + " time(s) ");
	
	}
	
	/** Judge weather the word has showed completely */
	public static boolean isShowAllLetter(char[] outputWord) {
		for(int i = 0; i < outputWord.length; i++) {
			if(outputWord[i] == '*') {
				return false;
			}
		}
		return true;
	}
	
	
	/** Guess a letter of the word */
	public static char guessALetter(String word, char[] outputWord) {
		// Output
		System.out.print("(Guess) Enter a letter in word ");
		System.out.print(outputWord);
		System.out.print(" > ");
		
		// Get a char from input
		return getALetterFromConsole();
	}
	
	
	/** Get a letter from console */
	public static char getALetterFromConsole() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Get a char from input
		String tempString = input.nextLine();
		return tempString.charAt(0);
	}

}
