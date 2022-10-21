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
public class Cupboards {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left[] = new int[n];
        int right[] = new int[n];
        
        int leftOne = 0, leftZero = 0;
        int rightOne = 0, rightZero = 0;
        
        for (int i = 0; i < n; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
            
            if(left[i] == 1) leftOne++;
            else leftZero++;
            
            if(right[i] == 1) rightOne++;
            else rightZero++;
        }
        
        int l = Math.min(leftOne, leftZero);
        int r = Math.min(rightOne, rightZero);
        
        System.out.println(l+r);
    }
    
}
