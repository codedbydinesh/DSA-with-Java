import java.util.*;

public class MissingElement {

    // first method
    public static int missingElement(int arr[]){
        int n = arr.length;
        int sum = 0;
        int sum2 = 0;
        for(int i = 1; i<=n+1; i++){
            sum +=i;
            
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            sum2+=arr[i];
            
        }
        
        return sum - sum2;
    }

    // second method
    public static int missingElem(int arr[]){
        int n = arr.length + 1;

        for(int i = 1; i <= n; i++){
            boolean flag = false;
            for(int j = 0; j < n-1; j++){
                if(arr[j] == i){
                    flag = true;
                }
            }
            if(flag==false){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Output -> form two different methods.
        int ans = missingElement(arr);
        int ans2 = missingElem(arr);

        System.out.println(ans+" "+ans2);
        sc.close();;
    }
}
