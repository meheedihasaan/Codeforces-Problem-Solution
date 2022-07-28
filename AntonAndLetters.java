/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class AntonAndLetters {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] ch = s.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        
        for(char c : ch){
            if(c >= 'a' && c <= 'z'){
                set.add(c);
            }
        }
        System.out.println(set.size());
    }
    
}
