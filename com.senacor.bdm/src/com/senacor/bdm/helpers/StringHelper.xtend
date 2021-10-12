package com.senacor.bdm.helpers

class StringHelper {
	
	/** Returns true if and only if the provided string starts with an upper case character. 
	 * Returns false if the argument is null.
	 */
	static def isFirstUpper(String string) {
		if (string.nullOrEmpty)
			return false
		Character.isUpperCase(string.charAt(0))
	}
	
	static def isFirstLower(String string) {
		if (string.nullOrEmpty)
			return false
		Character.isLowerCase(string.charAt(0))
	}
}