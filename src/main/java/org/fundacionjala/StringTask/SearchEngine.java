package org.fundacionjala.StringTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by LourdesVillca on 9/2/2016.
 */
public class SearchEngine {
    
    public static int find(String needle, String haystack) {
            String regex = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
            Matcher matcher = Pattern.compile(regex).matcher(haystack);
            return matcher.find() ? matcher.start() : -1;
    }

}
