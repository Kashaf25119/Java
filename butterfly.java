import java.util.*;
class Sample {
  public static void main(String[] args) {
//Upper pattern 
    for(int i=1;i<=5;i++){
       for(int j=1;j<=i;j++){
         System.out.print(" *");
         }
         int m = 2*(5-i);
         for(int j=1;j<= m ;j++){
           System.out.print("  ");
           } 
           for(int j=1;j<=i;j++){
         System.out.print(" *");
         }
           System.out.println();
     }
//Lower pattern 
     for(int i=4;i>=1;i--){
       for(int j=1;j<=i;j++){
         System.out.print(" *");
         }
         for(int j=1;j<= 2*(5-i);j++){
           System.out.print("  ");
           }
           for(int j=1;j<=i;j++){
         System.out.print(" *");
         }
           System.out.println();
     }
  }
}
