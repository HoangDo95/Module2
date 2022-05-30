package ss19_string_regex.bai_tap;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regexPhoneNumber = "^(.84)-(9|7)[0-9]{8}$";
        String testPhoneNumber = "+84-704478128";
        String testPhoneNumber1 = "+84704478128";
        boolean testRegex = Pattern.matches(regexPhoneNumber, testPhoneNumber);
        System.out.println(testRegex);
        boolean testRegex1 = Pattern.matches(regexPhoneNumber, testPhoneNumber1);
        System.out.println(testRegex1);
    }
}