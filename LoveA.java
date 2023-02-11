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
public class LoveA {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a'){
                x++;
            }
            else{
                y++;
            }
        }
        
        if(x > y){
            System.out.println(s.length());
        }
        else{
            System.out.println(x+x-1);
        }
    }
    
}
