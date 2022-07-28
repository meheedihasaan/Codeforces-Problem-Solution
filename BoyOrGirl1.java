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
public class BoyOrGirl1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i] == ch[j]){
                    count++;
                }
            }
        }
        int num = ch.length - count;
        
        if(num%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{  
            System.out.println("IGNORE HIM!");
        }
    }
    
}
