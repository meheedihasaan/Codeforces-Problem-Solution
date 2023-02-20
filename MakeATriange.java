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
public class MakeATriange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int x = Math.max(a, b);
        int y = Math.max(x, c);
        
        if(a+b > c && b+c > a && a+c > b){
            System.out.println(0);
        }
        else{
            if(y == a){
                System.out.println((a+1)-(b+c));
            }
            else if(y == b){
                System.out.println((b+1)-(a+c));
            }
            else if(y == c){
                System.out.println((c+1)-(a+b));
            }
        }
    }
    
}
