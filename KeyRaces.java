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
public class KeyRaces {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        
        int result1 = (s*v1) + (2*t1);
        int result2 = (s*v2) + (2*t2);
        
        if(result1 < result2){
            System.out.println("First");
        }
        else if(result1 > result2){
            System.out.println("Second");
        }
        else{
            System.out.println("Friendship");
        }
    }
    
}
