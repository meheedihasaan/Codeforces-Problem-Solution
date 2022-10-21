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
public class Coder {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String s1 = ""; 
        String s2 = "";
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){
                s1+='C';
                s2+='.';
            }
            else{
                s1+='.';
                s2+='C';
            }
        }
        
        System.out.println(((n*n)+1)/2);        
        for (int i = 0; i < n; i++) {
            if(i%2 == 0) System.out.println(s1);
            else System.out.println(s2);
        }
    }
    
}
