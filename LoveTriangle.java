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
public class LoveTriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = arr[a-1];
            int c = arr[b-1];
            int d = arr[c-1];
            
            if(a == d){
                flag = true;
            }
        }
        
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
