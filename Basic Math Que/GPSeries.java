import java.util.*;

public class GPSeries {
    public static void gpSeries(int a, int r, int n){
        for(int i = 1; i <= n; i++){
            int temp = a*(int)Math.pow(r, i-1);
            System.out.print(temp + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inter value of a: ");
        int a = sc.nextInt();
        System.out.print("Inter value of r: ");
        int r = sc.nextInt();
        System.out.print("Inter value of a: ");
        int n = sc.nextInt();
        gpSeries(a, r, n);
        sc.close();

    }
}
