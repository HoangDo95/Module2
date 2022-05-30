package ss19_string_regex.bai_tap;

import java.util.regex.Pattern;

public class ValidateNameClass {
    public static void main(String[] args) {
        String regexNameClass = "^[A|B|C]+[0-9]{4}+[G|H|I|K|L|M]$";
        String nameClass = "C0322G";
        String nameClass1 = "D0322A";
        boolean checkRegex = Pattern.matches(regexNameClass,nameClass);
        System.out.println(checkRegex);
        boolean checkRegex1 = Pattern.matches(regexNameClass,nameClass1);
        System.out.println(checkRegex1);
    }
}
