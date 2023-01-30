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
public class HolidayOfEquality {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        Arrays.sort(arr);
        int max = arr[n-1];
        int count = 0;
        
        for (int j = 0; j < n-1; j++) {
            count += max-arr[j];
        }
        System.out.println(count);
    }
    
}
