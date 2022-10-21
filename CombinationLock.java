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
public class CombinationLock {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = Character.getNumericValue(s1.charAt(i));
            int b = Character.getNumericValue(s2.charAt(i));
            int x = Math.abs(a-b);
            count+= Math.min(x, 10-x);
        }
        System.out.println(count);
    }
    
}
