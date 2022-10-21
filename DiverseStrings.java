/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class DiverseStrings {
    
    //Check If a String is Diverse or not
    public static boolean isDiverse(char[] ch){
        for (int i = 0; i < ch.length-1; i++) {
            if(ch[i] == ch[i+1] || ch[i+1] - ch[i] > 1){
                return false;
            }
        }
        return true;
    }
    
    //The Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String s = sc.next();
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            
            if(isDiverse(ch)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
