/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class KuroniAndTheGifts {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int arr1[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            
            int arr2[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            for (int i = 0; i < n; i++) {
                System.out.print(arr1[i]+" ");
            }
            System.out.println();
            
            for (int i = 0; i < n; i++) {
                System.out.print(arr2[i]+" ");
            }
            System.out.println();
        }
    }
    
}
