package org.general.leetcode;

import java.text.MessageFormat;

public class Test {
    public static void main(String[] args) {
        String message = "Property total stake is invalid. The provided value is [{0}].";
        String[] strs = {"1.1", "1.45"};
        String text = MessageFormat.format(message, (Object[]) strs);
        System.out.println(text);
    }
}
