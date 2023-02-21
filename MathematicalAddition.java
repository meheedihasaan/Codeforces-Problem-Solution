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
public class MathematicalAddition {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            long u = sc.nextLong();
            long v = sc.nextLong();
            
            long x = u*u*(-1);
            long y = v*v;
            System.out.println(x+" "+y);
        }
    }
    
}
