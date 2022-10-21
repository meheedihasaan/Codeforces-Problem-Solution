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
public class DawidAndBagsOfCandies {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if(a+b == c+d){
            System.out.println("YES");
        }
        else if(a+c == b+d){
            System.out.println("YES");
        }
        else if(a+d == b+c){
            System.out.println("YES");
        }
        else if(a+b+c == d){
            System.out.println("YES");
        }
        else if(a+b+d == c){
            System.out.println("YES");
        }
        else if(a+c+d == b){
            System.out.println("YES");
        }
        else if(b+c+d == a){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
