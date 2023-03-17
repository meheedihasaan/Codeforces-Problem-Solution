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
public class PlayOff_A {
    
    public static long power(int base, int pow){
        long res = 1;
        while(pow > 0){
            if(pow%2 == 0){
                base*=base;
                pow/=2;
            }
            else{
                res*=base;
                pow--;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            long ans = power(2, n);
            ans--;
            System.out.println(ans);
        }
    }
    
}
