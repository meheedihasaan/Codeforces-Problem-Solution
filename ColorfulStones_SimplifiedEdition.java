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
public class ColorfulStones_SimplifiedEdition {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int ans = 0;
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == s.charAt(ans)){
                ans++;
            }
        }       
        System.out.println(ans+1);
    }
    
}
