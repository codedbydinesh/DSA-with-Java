package arrays;


// reverse an Array
public class Reverse {

    public static void printArr(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5};
        for (int i = 0; i < arr.length / 2; i++) {
            int front = i;
            int last = arr.length - 1 - i;

            int temp = arr[front];
            arr[front] = arr[last];
            arr[last] = temp;
        }
        printArr(arr);
    }
}
