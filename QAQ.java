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
public class QAQ {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                for (int k = j+1; k < s.length(); k++) {
                    if(s.charAt(i) == 'Q' && s.charAt(j) == 'A' && s.charAt(k) == 'Q'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
