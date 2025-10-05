package strings;

import java.util.Scanner;

// palindrome with StringBuilder

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // first approach
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int last = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char lastChar = sb.charAt(last);

            sb.setCharAt(front, lastChar);
            sb.setCharAt(last, frontChar);
        }

        if (str.equals(sb.toString())) {
            System.out.println("first approach " + str + " is Palindrome");
        } else {

            System.out.println("1st approach " + str + " is not palindrome");

        }

        // Second approach

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("second approach " + str + " is Palindrome");
        } else {
            System.out.println("2nd approach " + str + " is not palindrome");
        }

        // third approach 
        boolean isPalindrome = true;
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println("third approach " + str + " is Palindrome");
        }else{
            System.out.println("3nd approach " + str + " is not palindrome");

        }

        sc.close();

    }
}
