
// Encrypted String



import java.util.*;
public class EncryptStr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int key = sc.nextInt();
        
        if(key<=0){
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                char newChar = (char)(((ch - 'A' + key)%26) + 'A');
                ans.append(newChar);
            }
            else if(ch >= 'a' && ch <= 'z'){
                char newChar = (char)(((ch - 'a' + key)%26) + 'a');
                ans.append(newChar);
            }
            else if(ch >= '0' && ch <= '9'){
                char newChar = (char)(((ch - '0' + key)%10) + '0');
                ans.append(newChar);
            }else{
                ans.append(ch);
            }
            
        }
        System.out.println(ans);

        sc.close();
    }
}