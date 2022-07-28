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
public class BetweenTheOffices {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if(s.charAt(0) == 'S' && s.charAt(n-1) == 'F'){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
