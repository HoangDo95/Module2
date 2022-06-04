package case_study.util;

import case_study.util.exception.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner scanner = new Scanner(System.in);

    public static String regexStr(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }

    public static String regexAge(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current < 100 && current > 20) {
                        check = false;
                    } else {
                        throw new AgeException("Tuổi phải lớn hơn 18 và bé hơn 100");
                    }
                } else {
                    throw new AgeException("Đinh dạng nhập vào không đúng");
                }

            } catch (AgeException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexName(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                } else {
                    throw new NameException("Sai định dạng, Chữ cái đầu viết hoa ");
                }
            } catch (NameException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexPhone(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                } else {
                    throw new PhoneNumberException("Sai định dạng, vui lòng nhập 0(7|9)XXXXXXX");
                }
            } catch (PhoneNumberException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexVilla(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                } else {
                    throw new VillaException("Sai định dạng, mã dịch vụ phải có dạng là VL-XXXX");
                }
            } catch (VillaException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexHouse(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                } else {
                    throw new HouseException("Sai định dạng, mã dịch vụ phải có dạng là HO-XXXX");
                }
            } catch (HouseException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexRoom(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                } else {
                    throw new RoomException("Sai định dạng, mã dịch vụ phải có dạng là RO-XXXX");
                }
            } catch (RoomException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexFloor(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                } else {
                    throw new FloorException("Sai định dạng, số tầng phải dương");
                }
            } catch (FloorException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexArea(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                } else {
                    throw new AreaException("Sai định dạng, diện tích phải lớn hơn 30");
                }
            } catch (AreaException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexRent(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                } else {
                    throw new RentException("Sai định dạng, giá tiền phải là số dương");
                }
            } catch (RentException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexAmount(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                } else {
                    throw new AmountException("Sai định dạng, giá tiền phải là số dương");
                }
            } catch (AmountException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}
