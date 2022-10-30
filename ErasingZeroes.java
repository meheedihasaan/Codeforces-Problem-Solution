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
public class ErasingZeroes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String s = sc.next();
            int n = s.length();

            //To Get The Index Of First '1'
            int i = 0;
            while(i < n){
                if(s.charAt(i) == '1'){
                    break; 
                }
                i++;
            }

            //To Get The Index Of Last '1' 
            int j = n-1;
            while(j >= 0){
                if(s.charAt(j) == '1'){
                    break; 
                }
                j--;
            }
            //System.out.println(i+" "+j);
            
            int count = 0;
            for (int k = i; k <= j; k++) {
                if(s.charAt(k) == '0'){
                    count++;
                }
            }  
            System.out.println(count);
        }
    }
    
}
