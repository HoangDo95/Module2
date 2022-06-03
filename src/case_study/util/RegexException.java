package case_study.util;

import java.util.Scanner;

public class RegexException {
    public static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_STR = "[A-Z][a-z]+"; //"^([A-Z]{1}[a-z]{1,}\\s{1}){1,}([A-Z]{1}[a-z]{1,})$"  ;
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



    //"^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
    public static String inputIdVilla() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "Bạn nhập sai định dạng, mã dịch vụ phải có dạng là VL-XXXX");
    }
    public static String inputIdHouse() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_HOUSE, "Bạn nhập sai định dạng, mã dịch vụ phải có dạng là HO-XXXX");
    }
    public static String inputIdRoom() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_ROOM, "Bạn nhập sai định dạng, mã dịch vụ phải có dạng là RO-XXXX");
    }

    public static String inputName() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn nhập sai định dạng, tên dịc vụ phải viết hoa chữ cái đầu");
    }

    public static String inputArea() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Bạn nhập sai định dạng, diện tích phải lớn hơn 30 ");
    }

    public static String inputTotalPay() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Bạn nhập sai định dạng, giá tiền phải là số dương");
    }

    public static String inputAmount() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_AMOUNT, "Bạn nhập sai định dạng, số lượng người tối đa phải >0 và <20");
    }

    public static String inputFloor() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_FLOOR, "Bạn nhập sai định dạng, số tầng phải dương");
    }
//    public static String choose(){
//        return RegexData.regexStr(scanner.nextLine(), REGEX_CHOOSE, "Bạn nhập sai định dạng, vui lòng nhập 1-3");
//    }
    public static String inputDayOfBirth(){
        return RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
    }

    public static String inputGender(){
        return RegexData.regexStr(scanner.nextLine(), REGEX_GENDER  , "Bạn nhập sai định dạng, vui lòng nhập 1-2");
    }
    public static String inputClassify(){
        return RegexData.regexStr(scanner.nextLine(), REGEX_CLASSIFY, "Bạn nhập sai định dạng, vui lòng nhập 1-5");
    }
    public static String choose1(){
        return RegexData.regexStr(scanner.nextLine(), REGEX_CHOOSE1, "Bạn nhập sai định dạng, vui lòng nhập 1-4");
    }
    public static String phoneNumber(){
        return RegexData.regexStr(scanner.nextLine(), REGEX_PHONE, "Bạn nhập sai định dạng, vui lòng nhập 0(7|9)XXXXXXX");
    }

}
