package org.apache.commons.lang3;

public class StringUtils {
    public static String removeEnd(String str, String remove) {
        if (isEmpty(str) || isEmpty(remove)) {
            return str;
        }
        if (str.endsWith(remove)) {
            return str.substring(0, str.length() - remove.length());
        }
        return str;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}