/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class GiftFixing1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for (int i = 0; i < t; i++) {
             int n = input.nextInt();
             int[] a = new int[n];
             int[] b = new int[n];
             int minA = -999999999;
             int minB = -999999999;
             
            for (int j = 0; j < n; j++) {
                a[j] = input.nextInt();
                minA = Math.min(minA, a[j]);
            }
            
            for (int k = 0; k < n; k++) {
               b[k] = input.nextInt();
               minB = Math.min(minB, b[k]);
            }
            
            long move = 0;
            for (int m = 0; m < n; m++) {
                move+= Math.max(a[m] - minA, a[m] - minB);
            }
            System.out.println(move);
        }
    }  
    
}
