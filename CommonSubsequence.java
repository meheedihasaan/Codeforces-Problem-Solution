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
public class CommonSubsequence {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
             int m = sc.nextInt();
            int[] arr1 = new int[n];           
            int[] arr2 = new int[m];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }           
            
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            
            int s = 0;
            boolean flag = false;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if(arr1[i] == arr2[j]){
                        s = arr1[i];
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            
            if(flag){
                System.out.println("YES");
                System.out.println(1+" "+s);
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
