package chapter9;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:50:19
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 9.6
 */
public class TestStopWatch {
	/** Main method */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// Generate a random array with length = 100000
		int[] array = generateRandom1DArray(100000);
		
		// Create the object of stopWatch
		StopWatch stopWatch = new StopWatch();
		
		// Start the StopWatch
		System.out.println("The stopWatch start!");
		stopWatch.start();
		
		// Run the selection sorting program
		selectionSorting(array);
		
		// End the StopWatch
		stopWatch.end();
		
		// Get the elapsed time and print it
		System.out.println("The elapsed time: " + stopWatch.getElapsedTime() + "(millisecond)");
		
	}
	
	// Generate a random 1Darray with length of n (0 <= x < 100)
	public static int[] generateRandom1DArray(int n) {
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		return array;
	}
	
	// Selection Sorting
	public static void selectionSorting(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int max = array[i];		// Store the maximum of the present number
			int maxIndex = i;		// Store the index of the maximum number
			for(int k = i; k < array.length; k++) {
				if(max < array[k]) {
					max = array[k];	// Update maximum 
					maxIndex = k;	// Update index
				}
			}
			// Swap
			int temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
		}
	}
	
}



// Define the StopWatch class with 3 constructors
class StopWatch{ 
	/**��Data area */
	private long startTime;
	private long endTime;
	
	/** Construct the StopWatch with startTime initial with current time */
	StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	/** Construct Start that reset the startTime to the current time*/
	void start() {
		startTime = System.currentTimeMillis();
	}
	
	/** Construct End that set the endTime to the current time */
	void end() {
		endTime = System.currentTimeMillis();
	}
	
	/** Return the recorded elapsed time of the StopWatch with the unit of millisecond */
	long getElapsedTime() {
		return endTime - startTime;
	}
	
}