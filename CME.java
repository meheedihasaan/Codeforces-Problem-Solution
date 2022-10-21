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
public class CME {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            if(n == 2){
                System.out.println(2);
            }
            else{
                if(n%2 == 0){
                    System.out.println(0);
                }
                else{
                    System.out.println(1);
                }
            }           
        }
    }
    
}
