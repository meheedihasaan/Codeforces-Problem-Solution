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
public class ArrayWithOddSum {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            int even = 0;
            int odd = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];               
                if(arr[j]%2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            if(sum%2 == 0){
                if(even != 0 && odd != 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("YES");
            }
        }
    }
    
}
