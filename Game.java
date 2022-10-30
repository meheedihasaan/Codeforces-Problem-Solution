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
public class Game {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        
        if(n1 <= n2){
            System.out.println("Second");
        }
        else{
            System.out.println("First");
        }
    }
    
}
