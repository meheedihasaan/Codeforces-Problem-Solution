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
public class MadokaAndMathDad {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int x;
            StringBuilder str = new StringBuilder();
            if(n%3 == 0){
                x = n/3;
                for (int i = 0; i < x; i++) {
                    str.append(21);
                }
            }
            else if(n%3 == 1){
                x = n/3;
                for (int i = 0; i < x; i++) {
                    str.append(12);
                }
                str.append(1);
            }
            else if(n%3 == 2){
                x = n/3;
                for (int i = 0; i < x; i++) {
                    str.append(21);
                }
                str.append(2);
            }
            System.out.println(str.toString());
        }
    }
    
}
