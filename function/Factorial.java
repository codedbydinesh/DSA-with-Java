package function;

import java.util.Scanner;

public class Factorial {
    public static void factorial(int num){
        
        int fact = 1;
        if(num<0){
            System.out.println("Invalid Number !!");
        }else{
            for(int i = num; i >= 1; i--){
                fact = fact * i; 
            }
            System.out.println("factorial of "+num+" is : "+fact);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        factorial(num);
        sc.close();
    }
}
