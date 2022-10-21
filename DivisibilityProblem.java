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
public class DivisibilityProblem {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rem = 0;
        
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            if(a%b==0){
                System.out.println(0);
            }
            else if(b>a){
                System.out.println(b-a);
            }
            else{
                rem = a%b;
                System.out.println(b-rem);
            }
            
        }
        
    }
    
}
