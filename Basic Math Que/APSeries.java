import java.util.*;
public class APSeries {
    public static void apSeries(int a, int d, int n){
        System.out.print(a+" ");
        for(int i=2; i<=n; i++){
            a = a + d;
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Inter value of a: ");
        int a = sc.nextInt();
        System.out.print("Inter value of d: ");
        int d = sc.nextInt();
        System.out.print("Inter value of n: ");
        int n = sc.nextInt();
        apSeries(a, d, n);

        sc.close();
    }
}
