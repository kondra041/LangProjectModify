package org.apache.commons.lang3;

import java.util.regex.Pattern;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class StringUtils {

    private static final Pattern PATTERN = Pattern.compile("^\\s+$");

    public static String substring(final String str, int start) {
        if (str == null) {
            return null;
        }
        // handle negatives, which means last n characters
        if (start < 0) {
            // remember start is negative
            start = str.length() + start;
        }
        if (start < 0) {
            start = 0;
        }
        if (start > str.length()) {
            return EMPTY;
        }
        return str.substring(start);
    }

    public static String substring(final String str, int start, int end) {
        if (str == null) {
            return null;
        }
        if (start < 0 || end > str.length() || start > end) {
            return EMPTY;
        }
        return str.substring(start, end);
    }

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0 || PATTERN.matcher(cs).matches();
    }

    // Other methods...

    public static String toString(final byte[] bytes, final String charsetName) throws UnsupportedEncodingException {
        return charsetName == null ? new String(bytes) : new String(bytes, charsetName);
    }
}