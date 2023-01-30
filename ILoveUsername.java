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
public class ILoveUsername {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        int count = 0;
        for (int j = 1; j < n; j++) {
            if(arr[j] > max){
                max = arr[j];
                count++;
            }
            if(arr[j] < min){
                min = arr[j];
                count++;
            }
        }
        System.out.println(count);
    }
    
}
