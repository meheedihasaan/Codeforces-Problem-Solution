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
public class DenseArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int count = 0;
            for (int i = 0; i < n-1; i++) {
                int min = Math.min(arr[i], arr[i+1]);
                int max = Math.max(arr[i], arr[i+1]);
                while(max > min*2){
                    min *= 2;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
