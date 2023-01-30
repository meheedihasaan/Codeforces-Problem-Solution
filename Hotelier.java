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
public class Hotelier {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String ans = "0000000000";
        char ch[] = ans.toCharArray();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == 'L'){
                for (int j = 0; j < ch.length; j++) {
                    if(ch[j] == '0'){
                        ch[j] = '1';
                        break;
                    }
                }
            }
            else if(s.charAt(i) == 'R'){
                for (int j = ch.length-1; j >= 0; j--) {
                    if(ch[j] == '0'){
                        ch[j] = '1';
                        break;
                    }
                }
            }
            else{
                int x = Character.getNumericValue(s.charAt(i));
                ch[x] = '0';
            }
        }
        
        for(char c : ch) System.out.print(c);
        System.out.println();
    }
    
}
