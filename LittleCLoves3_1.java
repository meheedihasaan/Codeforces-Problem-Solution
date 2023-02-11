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
public class LittleCLoves3_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%3 == 0){
            System.out.println(1+" "+1+" "+(n-2));
        }
        else if(n%3 == 1){
            System.out.println(1+" "+1+" "+(n-2));
        }
        else if(n%3 == 2){
            System.out.println(1+" "+2+" "+(n-3));
        }
    }
    
}
