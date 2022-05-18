package ss11_stack_queue.bai_tap;

import java.util.Stack;

public class ReverseString {
    public static Stack<Character> obj = new Stack<>();
    public static void reverse(StringBuffer str) {
         int n = str.length();
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));
        for (i = 0; i < n; i++)
        {
            char ch = obj.pop();
            str.setCharAt(i,ch);
        }
    }
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("Cafedev.vn");
        reverse(s);
        System.out.println("Reversed string is " + s);
    }
}

