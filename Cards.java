/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

 import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Cards {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int one = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == 'n'){
                one++;
            }
            else if(s.charAt(i) == 'z'){
                zero++;
            }
        }
        
        for (int i = 0; i < one; i++) {
            System.out.print(1+" ");
        }
        for (int i = 0; i < zero; i++) {
            System.out.print(0+" ");
        }
        System.out.println();
    }
    
}
