package ss01_java.bai_tap;

import java.util.Scanner;
//em còn trường hợp 3 chữ số làm chưa ra
public class NumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number1 = number / 10;
        int number2 = number % 10;
        int number3 = number / 100;
        int number4 = number % 100;
        String numberToLetter = "";
//        switch (number) {
//            case 0:
//                numberToLetter = "zero";
//                break;
//            case 1:
//                numberToLetter = "one";
//                break;
//            case 2:
//                numberToLetter = "two";
//                break;
//            case 3:
//                numberToLetter = "three";
//                break;
//            case 4:
//                numberToLetter = "four";
//                break;
//            case 5:
//                numberToLetter = "five";
//                break;
//            case 6:
//                numberToLetter = "six";
//                break;
//            case 7:
//                numberToLetter = "seven";
//                break;
//            case 8:
//                numberToLetter = "eight";
//                break;
//            case 9:
//                numberToLetter = "nine";
//                break;
//        }
        switch (number1) {
            case 1:
                numberToLetter = "ten";
                break;
            case 2:
                numberToLetter = "twenty";
                break;
            case 3:
                numberToLetter = "thirty";
                break;
            case 4:
                numberToLetter = "fourty";
                break;
            case 5:
                numberToLetter = "fifty";
                break;
            case 6:
                numberToLetter = "sixty";
                break;
            case 7:
                numberToLetter = "seventy";
                break;
            case 8:
                numberToLetter = "eighty";
                break;
            case 9:
                numberToLetter = "ninety";
                break;
        }
        switch (number2) {
            case 1:
                if (number1 == 1) {
                    numberToLetter = "eleven";
                    break;
                }
                numberToLetter = numberToLetter + " one";
                break;
            case 2:
                if (number1 == 1) {
                    numberToLetter = "twelve";
                    break;
                }
                numberToLetter = numberToLetter + " two";
                break;
            case 3:
                if (number1 == 1) {
                    numberToLetter = "thirteen";
                    break;
                }
                numberToLetter = numberToLetter + " three";
                break;
            case 4:
                if (number1 == 1) {
                    numberToLetter = "fourteen";
                    break;
                }
                numberToLetter = numberToLetter + " four";
                break;
            case 5:
                if (number1 == 1) {
                    numberToLetter = "fifteen";
                    break;
                }
                numberToLetter = numberToLetter + " five";
                break;
            case 6:
                if (number1 == 1) {
                    numberToLetter = "sixteen";
                    break;
                }
                numberToLetter = numberToLetter + " six";
                break;
            case 7:
                if (number1 == 1) {
                    numberToLetter = "seventeen";
                    break;
                }
                numberToLetter = numberToLetter + " seven";
                break;
            case 8:
                if (number1 == 1) {
                    numberToLetter = "eighteen";
                    break;
                }
                numberToLetter = numberToLetter + " eight";
                break;
            case 9:
                if (number1 == 1) {
                    numberToLetter = "nineteen";
                    break;
                }
                numberToLetter = numberToLetter + " nine";
                break;
        }
        switch (number3) {
            case 1:
                numberToLetter = "one hundred";
                break;
            case 2:
                numberToLetter = "two hundred";
                break;
            case 3:
                numberToLetter = "three hundred";
                break;
            case 4:
                numberToLetter = "four hundred";
                break;
            case 5:
                numberToLetter = "five hundred";
                break;
            case 6:
                numberToLetter = "six hundred";
                break;
            case 7:
                numberToLetter = "seven hundred";
                break;
            case 8:
                numberToLetter = "eight hundred";
                break;
            case 9:
                numberToLetter = "nine hundred";
                break;
        }
        switch (number4) {
            case 1:
                numberToLetter = numberToLetter + " and one";
                break;
            case 2:
                numberToLetter = numberToLetter + " and two";
                break;
            case 3:
                numberToLetter = numberToLetter + " and three";
                break;
            case 4:
                numberToLetter = numberToLetter + " and four";
                break;
            case 5:
                numberToLetter = numberToLetter + " and five";
                break;
            case 6:
                numberToLetter = numberToLetter + " and six";
                break;
            case 7:
                numberToLetter = numberToLetter + " and seven";
                break;
            case 8:
                numberToLetter = numberToLetter + " and eight";
                break;
            case 9:
                numberToLetter = numberToLetter + " and nine";
                break;
        }

        if (!numberToLetter.equals("")) System.out.printf("number '%d' is %s ", number, numberToLetter);
        else System.out.print("Invalid input!");
    }
}
