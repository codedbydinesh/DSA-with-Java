package recursion;

// print number n to 1
public class Recursion1 {
    public static void printNum(int n) {
        if (n == 0) { // base condition
            return;
        }
        System.out.println(n); // print number
        printNum(n - 1); // recursion
    }

    public static void main(String[] args) {
        int n = 5;
        printNum(n); // n = 5
    }
}
