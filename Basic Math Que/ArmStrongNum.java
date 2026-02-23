
import java.util.*;
public class ArmStrongNum {

    public static boolean isArmstrong(int num){
        int n = num;
        int count = 0;
        while (n != 0) {
            count++;
            n/=10;
        }

        // each digit count pow and sum
        int sum = 0;
        n = num;
        while (n != 0) {
            int rem = n % 10;

            sum+=Math.pow(rem, count);
            n = n / 10;
        }
        if(num==sum){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Yes, its an ArmStrong Number");
        }else{

            System.out.println("No, its not an ArmStrong Number");
        }

        sc.close();
    }
}