package ru.mirea.task30.op1;

import java.util.regex.Pattern;

public class ip {
    static String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

    static boolean check_ip(String str){
        return Pattern.matches(pattern, str);
    }
}
