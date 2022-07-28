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
public class BachgoldProblem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n/2);
        
        if(n%2 == 0){
            for (int i = 1; i <= n/2; i++) {
                System.out.print(2+" ");
            }
            System.out.println();
        }
        else{
            for (int j = 1; j < n/2; j++) {
                System.out.print(2+" ");
            }
            System.out.println(3);
        }
    }
    
}
