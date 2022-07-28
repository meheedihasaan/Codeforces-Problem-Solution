/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class AvoidTrygub {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            for (char c : ch) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
}
