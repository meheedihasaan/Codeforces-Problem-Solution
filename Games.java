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
public class Games {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            b[i] = input.nextInt();       
        }
        
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if(a[j] == b[k]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
