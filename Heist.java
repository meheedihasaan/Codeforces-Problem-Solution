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
public class Heist {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            int x = arr[i+1] - arr[i];
            count+=(x-1);
        }
        System.out.println(count);
    }
    
}
