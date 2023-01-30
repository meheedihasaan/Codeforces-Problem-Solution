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
public class Hulk {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%2 == 0){
                System.out.print("I love ");
            }
            else{
                System.out.print("I hate ");
            }
            
            if (i == n) {
                System.out.print("it");
            }
            else{
                System.out.print("that ");
            }
        }
    }
    
}
