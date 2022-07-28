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
public class B_Drinks {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f;
        int tot = 0;
        for (int i = 0; i < n; i++) {
            f = input.nextInt();
            tot+=f;
        }
        System.out.println((double)(tot*100)/(n*100));
    }
    
}
