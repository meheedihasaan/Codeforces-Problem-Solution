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
public class DominoPiling {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, result;
        m = input.nextInt();
        n = input.nextInt();
        
        result = m*n/2;
        System.out.println((int)result);              
    }
    
}
