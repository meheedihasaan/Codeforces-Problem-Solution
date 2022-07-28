/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class AmusingJoke {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next().toUpperCase();
        String b = input.next().toUpperCase();
        String c = input.next().toUpperCase();
        String d = a+b;
        char[] ch = d.toCharArray();
        char[] ch1 = c.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        
        String x = "";
        for (int i = 0; i < ch.length; i++) {
            x += ch[i];
        }
        
        String y = "";
        for (int j = 0; j < ch1.length; j++) {
            y += ch1[j];
        }
//        System.out.println(x);
//        System.out.println(y);
        if(x.equals(y)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
