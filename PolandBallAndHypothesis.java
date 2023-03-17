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
public class PolandBallAndHypothesis {
    
    //Prime Number Check
    public static boolean isPrime(int x){
        for (int i = 2; i < x; i++) {
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }
    
    
    //Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 1000; i++) {
            int a = (i*n)+1;
            if(!isPrime(a)){
                System.out.println(i);
                break;
            }
        }
    }
    
}
