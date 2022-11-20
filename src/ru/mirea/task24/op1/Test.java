package ru.mirea.task24.op1;

import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        String str1="127.0.0.1";
        String str2="255.255.255.0";
        String str3="1300.6.7.8";
        String str4="abc.def.gha.bcd";

        System.out.println(Pattern.matches(pattern, str1));
        System.out.println(Pattern.matches(pattern, str2));
        System.out.println(Pattern.matches(pattern, str3));
        System.out.println(Pattern.matches(pattern, str4));
    }
}
