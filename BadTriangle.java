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
public class BadTriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n]; 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); //Given Array Is Sorted
            }
            
            if((arr[0] + arr[1]) > arr[n-1]){
                System.out.println(-1);
            }
            else{
                System.out.println(1+" "+2+" "+n);
            }
        }
    }
    
}
