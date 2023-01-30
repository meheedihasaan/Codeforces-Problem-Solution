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
public class ImBoredWithLife {  
    
    //To Get Factorial
    public static long getFactorial(long n){
        long fact = 1;
        if(n == 0 || n == 1){
            fact = 1;
        }
        else{
            for (int i = 1; i <= n; i++) {
                fact *= i; 
            }
        }
        return fact;
    }
    
    //The Main Mehod
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long x;
        if(a < b){
            x = getFactorial(a);
        }
        else{
            x = getFactorial(b);
        }
        
        System.out.println(x);
    }
    
}
