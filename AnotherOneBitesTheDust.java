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
public class AnotherOneBitesTheDust {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        long x = a+c;
        long y = b+c;
        
        if(x == y){
            System.out.println(x+y);
        }
        else{
            long z = Math.min(x, y);
            System.out.println(z+z+1);
        }
        
    }
    
}
