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
public class JugglingLetters {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] count = new int[26];
            for (int j = 0; j < n; j++) {
                String s = sc.next();
                char[] ch = s.toCharArray();
                for (int k = 0; k < s.length(); k++) {
                    count[ch[k]-'a']++; //To Count occurance of each character
                }
            }
            
            boolean flag = true;
            for (int j = 0; j < count.length; j++) {
                if(count[j] % n != 0){
                    flag = false;
                }
            }
            
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
