package com.promineotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Week4LabPractice {

		public static void main(String[] args) {
			

			// 1. Why would we use a StringBuilder instead of a String?
			// 		a. Instantiate a new StringBuilder
			StringBuilder confused = new StringBuilder("") ;
			
			//		b. Append the characters 0 through 9 to it separated by dashes
			// 				Note:  make sure no dash appears at the end of the StringBuilder
			confused.append("0-1-2-3-4-6-7-8-9");
			System.out.println(confused);
			// 2. List of String:
			//		a. Create a list of Strings 
			List<String> stringList = new ArrayList<String>();
			//		b. Add 5 Strings to it, each with a different length
			stringList.add("Assume");
			stringList.add("conflate");
			stringList.add("Discombobulate");
			stringList.add("Agregate");
			stringList.add("Adult");
			System.out.println(stringList);
			// can also do :   Arrays.asList("Assume", "conflate", "Discombobulate", "Agregate","Adult") after the "stringList = "
			
			
			// 3. Write and test a method that takes a list of strings 
			//			and returns the shortest string
			System.out.println(findShortestString(stringList));
			// 4. Write and test a method that takes a list of strings 
			//			and returns the list with the first and last element switched

			System.out.println(swapFirstAndLast(stringList));
			// 5. Write and test a method that takes a list of strings 
			//			and returns a string with all the list elements concatenated to each other,
			// 			separated by a comma
			System.out.println(Concatination(stringList));
			
			// 6. Write and test a method that takes a list of strings and a string 
			//			and returns a new list with all strings from the original list
			// 			containing the second string parameter (i.e. like a search method)
			
			System.out.println(searchMethod(stringList, "ate"));
			// 7. Write and test a method that takes a list of integers 
			//			and returns a List<List<Integer>> with the following conditions specified
			//			for the return value:
			//		a. The first List in the returned value contains any number from the input list 
			//			that is divisible by 2
			//		b. The second List contains values from the input list that are divisible by 3
			//		c. The third containing values divisible by 5, and 
			//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
			List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);
			System.out.println(sortDivisibleNumbers(numbers));
			
			// 8. Write and test a method that takes a list of strings 
			//			and returns a list of integers that contains the length of each string
			System.out.println(lengthOfWords(stringList));

			
			// 9. Create a set of strings and add 5 values
			Set<String> values = new HashSet <String>();
			values.add("One");
			values.add("Two");
			values.add("Three");
			values.add("Four");
			values.add("Five");
			
			
			// 10. Write and test a method that takes a set of strings and a character 
			//			and returns a set of strings consisting of all the strings in the
			// 			input set that start with the character parameter.
			System.out.println(doesContain(values, 'F'));

			
			// 11. Write and test a method that takes a set of strings 
			//			and returns a list of the same strings
			System.out.println(copiedSet(values));
			

			// 12. Write and test a method that takes a set of integers 
			//			and returns a new set of integers containing only even numbers 
			//			from the original set
			Set<Integer> numberSet = new HashSet<Integer>();
			numberSet.add(1);
			numberSet.add(2);
			numberSet.add(3);
			numberSet.add(4);
			numberSet.add(5);
			numberSet.add(6);
			
			System.out.println(evenOnly(numberSet));

			
			// 13. Create a map of string and string and add 3 items to it where the key of each
			// 			is a word and the value is the definition of the word
			Map<String, String> dictionary = new HashMap<String, String>();
			dictionary.put("Augment", "make something greater or to increase it");
			dictionary.put("Diminish", "make or become less.");
			dictionary.put("Ostentatious", "characterized by vulgar or pretentious display");
		
			
			// 14. Write and test a method that takes a Map<String, String> and a string 
			// 			and returns the value for a key in the map that matches the
			// 			string parameter (i.e. like a language dictionary lookup)
			String value = dictionarySearch(dictionary, "Augment");
			System.out.println(value);
			
			// 15. Write and test a method that takes a List<String> 
			//			and returns a Map<Character, Integer> containing a count of 
			//			all the strings that start with a given character
			
			Map<Character, Integer> counts = characterString(stringList); //creating a map made up of the characters and the int for the # of words that start with it
			for (Character character : counts.keySet()) {
				System.out.println(character + " - " + counts.get(character));
			}

		}
		
		
		// Method 15:
		public static Map<Character, Integer> characterString (List<String> list) {
			Map<Character, Integer> results = new HashMap<Character, Integer>();
			for(String words : list) {
				char firstLetter = words.charAt(0);
				if (results.get(firstLetter) == null ) { // if the first letter of 
					results.put(firstLetter, 1);
				} else {
					results.put(firstLetter, results.get(firstLetter) + 1) ;
				}
			}
			return results;
		}
		
		
		// Method 14:
		public static String dictionarySearch (Map<String, String> list, String word) {
			for (String keyWord : list.keySet()) {
				if (keyWord.equals(word)) { // when using a String for .contains, use .equals instead
					return list.get(keyWord);//gets the value for the 
				}
			}
				
			
			
			return "";
		}
		



		
		// Method 12:
		public static Set<Integer> evenOnly (Set<Integer> list) {
			Set<Integer> results = new HashSet<Integer>();
			for (Integer number : list) {
				if (number % 2 == 0)
					results.add(number);
			}
			return results;
		}

		
		// Method 11:
		public static List<String> copiedSet (Set<String> list) {
			List<String> results = new ArrayList<String>();
			for (String words : list) {
				results.add(words);
			}
			return results;
		}


		// Method 10:
		public static Set<String> doesContain (Set<String> list, char character) {
			Set<String> results = new HashSet<String>();
			for (String words : list) {
				if (words.charAt(0) == character) {
					results.add(words);
				}
					
				}
			return results;
			
		}

		
		// Method 8:
		public static List<Integer> lengthOfWords (List<String> list) {
			List<Integer> length = new ArrayList<Integer>();
			for (String word : list) {
				length.add(word.length());
			} return length;
		}

		
		// Method 7:
		public static List<List<Integer>> sortDivisibleNumbers (List<Integer> list) {
			List<List<Integer>> results = new ArrayList<List<Integer>>(); //HERE WE CREATE A LIST OF INTEGERS WITHIN A LIST OF INTEGERS
			results.add(new ArrayList<Integer>()); // HERE WE ARE CREATING EACH LIST
			results.add(new ArrayList<Integer>());
			results.add(new ArrayList<Integer>());
			results.add(new ArrayList<Integer>());
			
			for (Integer number : list ) {
				if (number % 2 == 0) {
					results.get(0).add(number);
				} if (number % 3 == 0) {
					results.get(1).add(number);
			}	if (number % 5 == 0) {
				results.get(2).add(number);
			} if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);
			}
			}
			return results;
		}

		
		// Method 6:
		public static List<String> searchMethod(List<String> list, String query) {
			List<String> results = new ArrayList<String>();
			for (String string : list) {
				if (string.contains(query)) {
					results.add(string);
				}
			
				
			}
			return results;
		}

		
		// Method 5:
		public static String Concatination(List<String> list) {
			String finalCat = " ";
			for (int i = 0; i < list.size(); i++) {
				
				finalCat += list.get(i) + ", ";
			} return finalCat;
		}
		
		
		// Method 4:
		public static List<String> swapFirstAndLast(List<String> list) {
			String temp = list.get(0);
			list.set(0, list.get(list.size() - 1)); // lets you override the element in space 0 with the element of your choice
			list.set(list.size() - 1, temp) ; // overrides the last space with the first word through the temporary use of variable temp
			return list;
		}
		
		
		// Method 3:
		
		public static String findShortestString(List<String> list) {
			String shortest = list.get(0);
			for (String string :list) {
				if (string.length() < shortest.length()) {
					shortest = string;
					
				}
				
				}
			return shortest;
			} 
			
		}
		
			
			
			
			
			
			
			
		

