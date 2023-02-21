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
public class MaximumInTable {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[0][i] = 1;
            arr[i][0] = 1;
        }
        for (int k = 1; k < n; k++) {
            for (int p = 1; p < n; p++) {
                arr[k][p] = arr[k-1][p]+arr[k][p-1];
            }
        }
        System.out.println(arr[n-1][n-1]);
    }
    
    
}
