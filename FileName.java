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
public class FileName {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length()-2; i++) {
            if(s.charAt(i) == 'x' && s.charAt(i+1) == 'x' && s.charAt(i+2) == 'x'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
