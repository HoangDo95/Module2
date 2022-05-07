package ss02_loop_array.bai_tap.Loop;

public class In20snt {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (count < 20) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                count++;
                System.out.println(number);
            }
            number++;
        }
    }
}
