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
public class CardGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            
            int[] arr1 = new int[k1];
            int[] arr2 = new int[k2];
            
            int max1 = 0;
            for (int i = 0; i < k1; i++) {
                arr1[i] = sc.nextInt();
                if(arr1[i] > max1){
                    max1 = arr1[i];
                }
            }
            
            int max2 = 0;
            for (int i = 0; i < k2; i++) {
                arr2[i] = sc.nextInt();
                if(arr2[i] > max1){
                    max2 = arr2[i];
                }
            }
            
            if(max1 > max2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
