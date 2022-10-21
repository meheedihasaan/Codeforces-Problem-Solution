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
public class DieRoll {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int y = sc.nextInt();
        int n = 7-Math.max(w, y);
        
        switch(n){
            case 1 :
                System.out.println("1/6");
                break;
            case 2 :
                System.out.println("1/3");
                break;
            case 3 :
                System.out.println("1/2");
                break;
            case 4 :
                System.out.println("2/3");
                break;
            case 5 :
                System.out.println("5/6");
                break;
            case 6 :
                System.out.println("1/1");
                break;
        }
    }
    
}
