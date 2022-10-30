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
public class EpicGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int t = 1;
        while(n != 0){
            if(t == 1){
               n -= getGCD(a,n);
               t = 0;
            }
            else if(t == 0){
                n-= getGCD(b, n);
                t = 1;
            }
        }
        
        if(t == 0){
            System.out.println(0);
        }
        else if(t == 1){
            System.out.println(1);
        }
    }
    
    public static int getGCD(int x, int y){
        int d = 0;
        if(x == 0){
            d = y;
        }
        else if(y == 0){
            d = x;
        }
        else{
//            for (int i = 1; i <= x && i <= y; i++) {
//                if(x%i == 0 && y%i == 0){
//                    d = i;    //Common Method Of Getting GCD
//                }
//            }
            d = getGCD(y, x%y); //Another Method of Getting GCD
        }
        
        return d;
    }
    
}
