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
public class DivideIt {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
             long n = sc.nextLong();
             long count = 0;
             while(n > 1){
                 if(n%2 == 0){
                     n = n/2;
                     count+=1;
                 }
                 if(n%3 == 0){
                     n = (2*n)/3;
                     count+=1;
                 }
                 if(n%5 == 0){
                     n = (4*n)/5;
                     count+=1;
                 }
                 if(n%2 != 0 && n%3 != 0 && n%5 != 0 && n != 1){
                     count = -1;
                     break;
                 }
                 
             }
             System.out.println(count);
        }
    }
    
}
