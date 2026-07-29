package org.apache.commons.lang3;

public final class StringUtils {

    private StringUtils() {}

    public static String strip(String str, final String stripChars) {
        if (isEmpty(str)) {
            return str;
        }
        str = stripStart(str, stripChars);
        return stripEnd(str, stripChars);
    }

    public static String stripStart(String str, final String stripChars) {
        int start = skipWhitespace(str, 0, true);
        if (start == str.length()) {
            return str;
        } else {
            return str.substring(start);
        }
    }

    public static String stripEnd(String str, final String stripChars) {
        int end = reverseSkipWhitespace(str, str.length() - 1, false);
        if (end == -1 || end == str.length()) {
            return str;
        } else {
            return str.substring(0, end + 1);
        }
    }

    private static int skipWhitespace(String str, int start, boolean include) {
        while (start < str.length() && Character.isWhitespace(str.charAt(start))) {
            if (!include) {
                break;
            }
            start++;
        }
        return start;
    }

    private static int reverseSkipWhitespace(String str, int end, boolean include) {
        while (end >= 0 && Character.isWhitespace(str.charAt(end))) {
            if (!include) {
                break;
            }
            end--;
        }
        return end;
    }

    public static String strip(String str) {
        if (str == null) {
            return null;
        } else {
            int start = skipWhitespace(str, 0, true);
            int end = reverseSkipWhitespace(str, str.length() - 1, false);
            if (start > end) {
                return "";
            } else {
                return str.substring(start, end + 1);
            }
        }
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    // Other methods...

}