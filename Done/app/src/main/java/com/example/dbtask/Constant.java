package com.example.dbtask;

/**
 * CONSTANT CLASS TO CREATE AND USE THE CONSTANTS AND STATIC VALUES IN ALL OVER THE APPLICATION. 
 * 
 * @author Android
 *
 */
public class Constant {


	public static String student_id =null;
	private static final char[] ATEXT_SYMBOLS =	{'@','.','_'}; //defining ATEXT SYMBOLS

	public static boolean isBasicallyValidEmailAddress(String email) {
		if (email == null) {  //IF EMAIL FIELD IS EMPTY RETURN FALSE
			return false;
		}
		boolean atFound = false; // DEFINING AT FOUND AS FALSE
		for (int i = 0; i < email.length(); i++) {
			char c = email.charAt(i);   //take every single character from the email inputed
			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9') && !isAtextSymbol(c)) { // checks if valid letters are inputed from ascii table
				return false; //if wrong symbols are entered then return false
			}
			if (c == '@') {
				if (atFound) { //if "@" wasn't found then return false
					return false;
				}
				atFound = true; // otherwise return true
			}
		}
		return atFound; // atFound = true
	}


    //this function will ALLOW the following symbols to be true ( @ , . , _ )
	public static boolean isAtextSymbol(char c) {
		for (int i = 0; i < ATEXT_SYMBOLS.length; i++) {
			if (c == ATEXT_SYMBOLS[i]) {
				return true;
			}
		}
		return false;
	}
}
