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
public class EvenArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int fine = 0;
            int even = 0;
            int odd = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                
                if(j%2 == 0){
                    if(arr[j]%2 == 0){
                        fine++;
                    }
                    else{
                        odd++;
                    }
                }
                else{
                    if(arr[j]%2 == 0){
                        even++;
                    }
                    else{
                        fine++;
                    }
                }
            }
            if(fine == arr.length){
                System.out.println(0);
            }
            else if(even == odd){
                System.out.println(even);
            }
            else if(even != odd){
                System.out.println(-1);
            }
//            System.out.println(even);
//            System.out.println(odd);
//            System.out.println(fine);
        }
    }
    
}
