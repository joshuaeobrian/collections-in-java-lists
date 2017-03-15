package com.theironyard;

import java.util.ArrayList;

/**
 * This exercise is another collection of katas. Follow the instructions below
 * to create the specified methods.
 */
public class ListKatas {

    /**
     * Create a static method named arrayListIndexes() that accepts a single int
     * argument, n. The method should return a new ArrayList of Integers
     * containing `n` elements, each set to their index in the list. For
     * example, if n were 5 you would create this ArrayList:
     *
     * [0, 1, 2, 3, 4]
     *
     * Note: Remember that ArrayLists can only hold objects. That means you must
     * make an ArrayList of Integer objects. However, Java will autobox int
     * values so you can put int primitives into a List of Integer objects.
     *
     * @param n The integer length of the ArrayList to create
     * @return An ArrayList of Integers, starting at 0 and continuing to n-1
     */
    // todo: create arrayListIndexes() method
	public static ArrayList<Integer> arrayListIndexes(int n){
		ArrayList<Integer> integers = new ArrayList<>();

		 for(int index=0; index < n; index++){
			integers.add(index);
			}

		return integers;
	}

    /**
     * Write a static method named sumList() that accepts an ArrayList of
     * Doubles and returns the sum of all of the numbers. The length of the list
     * received is arbitrary and unbounded. If there are zero numbers in the
     * list then return 0.
     *
     * @param numbers a list of doubles
     * @return the sum of the provided List of Doubles
     */
    // todo: create sumList() method
	public static double sumList(ArrayList<Double> numbers){
		// declaring a double with the value of 0
		double sum = 0;
		//for looping through the ArrayList
		for(int index = 0; index < numbers.size(); index++){

			sum += numbers.get(index);
		}
		return sum;
	}

    /**
     * Create a static method named concatenateStrings() that accepts an
     * ArrayList of Strings and concentrates them together. The ArrayList of
     * String objects is arbitrary and unbounded. If there are zero Strings in
     * the ArrayList then return an empty string.
     *
     * @param strings an ArrayList of Strings
     * @return a concatenation of the provided ArrayList of strings.
     */
    // todo: create concatenateStrings() method
	public static String concatenateStrings(ArrayList<String> strings){
		String str = "";

		for(int index = 0; index < strings.size(); index++){
			str += strings.get(index);
		}
		return str;
	}

    /**
     * Create a static method named reverseListOfStrings() that accepts an
     * ArrayList of Strings. The method should return a new ArrayList containing
     * the same String values in the reverse order. For example:
     *
     * input:
     *
     * ["This", "is", "a", "list"]
     *
     * reversed:
     *
     * ["list", "a", "is", "This"]
     *
     * Because the input and result can contain only contain Strings, make sure
     * you are specifying the correct generics.
     *
     * Note: This exercises assumes you will create and populate a new ArrayList
     * of Strings with the reverse of the values in the `strings` argument.
     *
     * @param strings an ArrayList of Strings
     * @return an ArrayList of Strings in reverse order
     */
    // todo: create reverseListOfStrings() method
	public static ArrayList<String>reverseListOfStrings(ArrayList<String> strings){
		ArrayList<String> reverse = new ArrayList<>();
		for(int index = strings.size()-1; 0 <= index; index--){
			reverse.add(strings.get(index));
		}
		return reverse;
	}

}
