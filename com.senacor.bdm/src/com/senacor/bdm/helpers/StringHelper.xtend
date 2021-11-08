package com.senacor.bdm.helpers

import org.eclipse.emf.common.util.URI

class StringHelper {

	/** Returns true if and only if the provided string starts with an upper case character. 
	 * Returns false if the argument is null.
	 */
	static def isFirstUpper(String string) {
		if (string.nullOrEmpty)
			return false
		Character.isUpperCase(string.charAt(0))
	}

	/** Returns true if and only if the provided string starts with a lower case character. 
	 * Returns false if the argument is null.
	 */
	static def isFirstLower(String string) {
		if (string.nullOrEmpty)
			return false
		Character.isLowerCase(string.charAt(0))
	}

	/** Returns the last segment of a provided string. Segements have to be seperated by a dot >.< . 
	*/
	static def getLastSegment(String string) {
		return string.substring(string.lastIndexOf('.') + 1);
	}

	/** Returns the filename of a provided URI without the file extension. 
	*/
	
	static def getFilenameWithoutExtension(URI uri) {
		return uri.segment(uri.segmentCount - 1).substring(0, uri.segment(uri.segmentCount - 1).indexOf("."))
	}
}
