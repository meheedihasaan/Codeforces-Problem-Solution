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
public class BoyOrGirl {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int count = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        int letter = s.length() - count;
        
        if(letter % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
    
    
}
