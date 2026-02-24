import java.util.*;
public class PerfectNum {
    public static boolean isPerfectNum(int num){
        // find all divisors
        int sum = 1;
        for(int i=2; i <= Math.sqrt(num); i++){
            if (num%2==0) {
                sum+=i;
                if(i!=num/i){
                    sum+=(num/i);
                }
            }
        }

        System.out.println(sum);
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPerfectNum(n)){
            System.out.println("perfect Number");
        }else{
            System.out.println("Not perfect");
        }
        sc.close();
    }
}
