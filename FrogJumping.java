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
public class FrogJumping {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            int n = sc.nextInt();
            
            long right = 0;
            long left = 0;
            long ans = 0;
            if(n%2 == 0){
                right = a*(n/2);
                left = b*(n/2);
                ans = right-left;
            }
            else{
                right = a*((n/2)+1);
                left = b*(n/2);
                ans = right-left;
            }
            System.out.println(ans);
        }
    }
    
}
