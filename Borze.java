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
public class Borze {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
         for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i)== '.'){
                 System.out.print(0);
             }
             else if(s.charAt(i) == '-'){
                 if(s.charAt(i+1) == '.'){
                     System.out.print(1);
                 }
                 else if(s.charAt(i+1) == '-'){
                     System.out.print(2);
                 }
                 i++;
             }
         }
         System.out.println();
    }
}
