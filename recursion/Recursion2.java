package recursion;


// print number from 1 to (n != infinite or 5)
public class Recursion2 {
        public static void printNum(int n) {
        if (n == 6) { // base condition
            return;
        }
        System.out.println(n); // print number
        printNum(n + 1); // recursion
    }

    public static void main(String[] args) {
        int n = 1;
        printNum(n); // n = 5
    }
}
