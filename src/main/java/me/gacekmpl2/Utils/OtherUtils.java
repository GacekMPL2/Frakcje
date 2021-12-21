package me.gacekmpl2.Utils;

public class OtherUtils {
    public static boolean isInteger(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
