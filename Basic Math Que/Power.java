import java.util.*;
public class Power {
    public static void pow(int n, int p){
        // O(log2p);
        int ans = 1;
        while (p>0) {
            if(p%2==1){
                ans*=n;
                p=p-1;
            }else{
                n = n*n;
                p = p/2;
            }
        }
        System.out.println("square of given number: "+ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter Power: ");
        int p= sc.nextInt();
        pow(n,p);
        sc.close();
    }
}
