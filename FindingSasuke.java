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
public class FindingSasuke {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            for (int i = n-1; i >= 0; i--) {
                if(i%2 == 0){
                    System.out.print((arr[i]*-1)+ " ");
                }
                else{
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    
}