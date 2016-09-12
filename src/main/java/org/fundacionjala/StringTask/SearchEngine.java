package org.fundacionjala.stringtask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class that make a search in a String
 */
public class SearchEngine {

    private SearchEngine() {

    }

    /**
     * Method that make the search process
     * @param needle the string to be searched
     * @param haystack String where the search process is executed
     * @return the start position if the word is found if not it return -1
     */
    public static int find(String needle, String haystack) {
        final String regex = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
        Matcher matcher = Pattern.compile(regex).matcher(haystack);
        return matcher.find() ? matcher.start() : -1;
    }

}
