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
public class EvenSubstring {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = Character.getNumericValue(s.charAt(i));
            if(x%2 == 0){
                count+=i+1;
            }
        }
        System.out.println(count);
    }
    
}
