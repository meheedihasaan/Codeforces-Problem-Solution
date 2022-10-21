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
public class Cards701A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        
        int target = sum/(n/2);
        
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j] == target && arr[i]+arr[j] != 0){
                    System.out.println((i+1)+" "+(j+1));
                    arr[i] = 0;
                    arr[j] = 0;
                    break;
                }
            }
        }
    }
    
}
