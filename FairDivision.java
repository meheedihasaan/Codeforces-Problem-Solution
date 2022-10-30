/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class FairDivision {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int sum1 = 0;
            int sum2 = 0;
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < n; j++) {
                int w = sc.nextInt();
                if(w == 1){
                    sum1+=w;
                    count1++;
                }
                else if(w == 2){
                    sum2+=w;
                    count2++;
                }
            }
            if(sum1 != 0 && sum2 != 0){
                if(sum1 % 2 == 0 && sum2 % 2 == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                if(count1 % 2 == 0 && count2 % 2 == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
    
}
