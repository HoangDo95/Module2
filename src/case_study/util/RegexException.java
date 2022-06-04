package case_study.util;

import java.util.Scanner;

public class RegexException {
    public static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(VL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(HO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(RO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[0-9]+$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";
    public static final String REGEX_FLOOR = "^[1-9]|([1][0-9])$";
    public static final String REGEX_PHONE = "^(0)(9|7)[0-9]{8}$";
    public static final String REGEX_CHOOSE1 = "^[1-3]$";
    public static final String REGEX_CLASSIFY = "^[1-5]$";
    public static final String REGEX_GENDER = "^[1-2]$";
    private static final String REGEX_BIRTHDAY =
            "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static String inputIdVilla() {
        return RegexData.regexVilla(scanner.nextLine(), REGEX_ID_VILLA);
    }

    public static String inputIdHouse() {
        return RegexData.regexHouse(scanner.nextLine(), REGEX_ID_HOUSE);
    }

    public static String inputIdRoom() {
        return RegexData.regexRoom(scanner.nextLine(), REGEX_ID_ROOM);
    }

    public static String inputName() {
        return RegexData.regexName(scanner.nextLine(), REGEX_STR);
    }

    public static String inputArea() {
        return RegexData.regexArea(scanner.nextLine(), REGEX_AREA);
    }

    public static String inputTotalPay() {
        return RegexData.regexRent(scanner.nextLine(), REGEX_INT);
    }

    public static String inputAmount() {
        return RegexData.regexAmount(scanner.nextLine(), REGEX_AMOUNT);
    }

    public static String inputFloor() {
        return RegexData.regexFloor(scanner.nextLine(), REGEX_FLOOR);
    }

    public static String inputDayOfBirth() {
        return RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
    }

    public static String phoneNumber() {
        return RegexData.regexPhone(scanner.nextLine(), REGEX_PHONE);
    }

    public static String inputGender() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_GENDER, "Bạn nhập sai định dạng, vui lòng nhập 1-2");
    }

    public static String inputClassify() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_CLASSIFY, "Bạn nhập sai định dạng, vui lòng nhập 1-5");
    }

    public static String choose1() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_CHOOSE1, "Bạn nhập sai định dạng, vui lòng nhập 1-4");
    }
}
