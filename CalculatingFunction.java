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
public class CalculatingFunction {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        
        if(n%2 == 0){
            System.out.println(n/2);
        }
        else{
            System.out.println(((n/2)+1)*(-1));
        } 
    }
    
}
