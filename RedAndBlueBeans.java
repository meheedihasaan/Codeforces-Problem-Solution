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
public class RedAndBlueBeans {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();
            if(a == b){
                System.out.println("YES"); 
            }
            else{
                int max = Math.max(a, b);
                int min = Math.min(a, b);
                int div = (max+min-1)/min; //Ceiling Division
                if((div-1) <= d){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
    
}
