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
public class Magnets {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        for (int j = 0; j < n-1; j++) {
            if(arr[j] != arr[j+1]){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
