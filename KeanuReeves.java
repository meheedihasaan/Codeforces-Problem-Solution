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
public class KeanuReeves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] ch = s.toCharArray();
        int one = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if(ch[i] == '1'){
                one++;
            }
            else{
                zero++;
            }
        }
        
        if(one != zero){
            System.out.println(1);
            System.out.println(s);
        }
        else{
            System.out.println(2);
            System.out.print(s.substring(0, n-1)+" ");
            System.out.println(ch[n-1]);
        }
    }
}
