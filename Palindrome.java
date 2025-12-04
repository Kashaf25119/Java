import java.util.*;
class Main{
    public static void checkPalindrome(String str, int len, int idx, String newStr){
        if(idx == len ){
          if(str.equals(newStr)){
              System.out.println("String is palindrome ");
              return;
          }
          else{
              System.out.println("String is not palindrome ");
              return;
          }
        }
        newStr += str.charAt(len-idx-1);
        checkPalindrome(str, len, idx+1, newStr);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        checkPalindrome(str.toLowerCase(),str.length(), 0, "");
    }
}
