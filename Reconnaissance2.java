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
public class Reconnaissance2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int min = 1001;
        int x = 0;
        int y = 0;
        for (int i = 0; i < n-1; i++) {
            if(Math.abs(arr[i]-arr[i+1]) < min){
                min = Math.abs(arr[i] - arr[i+1]);
                x = i+1;
                y = i+2;
            }
        }
        if(Math.abs(arr[0]-arr[n-1]) < min){
            System.out.println(n+" "+1);
        }
        else{
            System.out.println(x+" "+y);
        }
    }
    
}
