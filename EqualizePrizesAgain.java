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
public class EqualizePrizesAgain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            long total = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                total += a;
            }
            System.out.println((total+n-1)/n);
        }
    }
    
}
