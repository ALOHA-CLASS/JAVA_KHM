package MS06;

import java.util.Arrays;
import java.util.Scanner;

public class Lottoria {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("몇 게임? ");
      int N = sc.nextInt();
      for (int x = 0; x < N; x++) {
         System.out.print("[" + (x+1) + " 게임] : ");
         int[] lotto = new int[6];
         for (int i = 0; i < lotto.length; i++) {
            int rand = (int) (Math.random()*45 + 1);
            lotto[i] = rand;
            for (int j = 0; j < lotto.length; j++) {
               if( i == j ) continue;
               if( rand == lotto[j] ) {
                  i--;
                  break;
               }
            }
         }
         
         Arrays.sort(lotto);
         
         for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
         }
         System.out.println();
      }
      
      
      sc.close();
   }
}