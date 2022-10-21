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
public class CopyPaste {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            int x = arr[0];
            int count = 0;
            for (int i = 1; i < n; i++) {
                int y = k-arr[i];
                int z = y/x;
                count+=z;
            }
            System.out.println(count);
        }
    }
    
}
