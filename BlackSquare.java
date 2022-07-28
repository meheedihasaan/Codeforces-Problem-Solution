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
public class BlackSquare {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)){
                case '1':
                    sum+=a;
                    break;
                case '2':
                    sum+=b;
                    break;
                case '3':
                    sum+=c;
                    break;
                case '4':
                    sum+=d;
                    break;
            }           
        }
        System.out.println(sum);
    }
    
}
