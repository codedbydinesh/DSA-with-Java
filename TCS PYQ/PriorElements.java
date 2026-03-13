import java.util.*;


public class PriorElements {
    public static int prior(int arr[]){
        int count=0;
        int maximum = Integer.MIN_VALUE;
        for(int i =0; i < arr.length; i++){
            if(maximum<arr[i]){
                maximum = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = prior(arr);
        System.out.println(ans);
        sc.close();
    }
}
