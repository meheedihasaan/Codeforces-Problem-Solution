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
public class GennadyAndACardGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.next();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            String hc = sc.next();
            if(tc.charAt(0) == hc.charAt(0) || tc.charAt(1) == hc.charAt(1)){
                count++;
            }
        }
        if(count == 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
    
}
