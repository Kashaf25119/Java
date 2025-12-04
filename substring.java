import java.util.*;
class Main{
    public static void subsequences(String str, int idx, String newStr, HashSet<String> set){
        if(idx == str.length()){
          if(set.contains(newStr)) {
            return;
          } else {
            System.out.println(newStr);
            set.add(newStr);
            return;
          }
        }
        char currentChar = str.charAt(idx);
        subsequences(str, idx+1, newStr+currentChar, set);
        subsequences(str, idx+1, newStr, set);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}
