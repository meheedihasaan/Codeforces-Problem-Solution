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
public class GeorgeAndAccommodation {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p, q;
        int r = 0;
        for (int i = 0; i < n; i++) {
            p = input.nextInt();
            q = input.nextInt();
            
            if(p+1 < q){
                r++; //P+1 taken for george's friend;There sould be 2 available sit...
            }
        }
        System.out.println(r);
    }
    
}
