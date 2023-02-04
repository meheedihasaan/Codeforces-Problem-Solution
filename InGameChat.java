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
public class InGameChat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for (int i = s.length()-1; i <= 0; i--) {
                if(s.charAt(i) == ')'){
                    count++;
                }
                else break;               
            }
            
            int rem = n-count;
            if(rem < count){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
    
}
