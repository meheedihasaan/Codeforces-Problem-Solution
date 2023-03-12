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
public class Pangram {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next().toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
//        
//        System.out.println(set.size());
//        for (char c : set) {
//            System.out.println(c);
//        }
        if(set.size() ==26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
