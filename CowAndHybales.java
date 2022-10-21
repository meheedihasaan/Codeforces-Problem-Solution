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
public class CowAndHybales {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int x = arr[0];
            int j = 0;
            for (int i = 1; i < n; i++) {
                int y = arr[i];
                for (int k = y; k > 0; k--) {
                    d-=(j+1);
                    if(d < 0){
                        break;
                    }
                    x+=1;
                    y--;
                }
                j++;
            }
            System.out.println(x);
        }
    }
    
}
