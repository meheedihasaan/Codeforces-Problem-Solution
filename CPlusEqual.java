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
public class CPlusEqual {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int c = 0;
            int count = 0;
            while(c <= n){
                c = Math.min(a, b);
                int d = Math.max(a, b);
                c+=d;
                a = c;
                b = d;
                count++;
            }
            System.out.println(count);
        }             
    }
    
}
