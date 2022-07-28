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
public class AntonAndDanik {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next().toUpperCase();
        int a = 0;
        int d = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A'){
                a++;
            }
            else if(s.charAt(i) == 'D'){
                d++;
            }
        }
        if(a==d){
            System.out.println("Friendship");
        }
        else if(a>d){
            System.out.println("Anton");
        }
        else if(a<d){
            System.out.println("Danik ");
        }
    }
    
}
