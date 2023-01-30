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
public class HelpfulMaths {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int[] num = new int[(s.length()+1)/2];
        int index = 0;
        
        for (char c : s.toCharArray()) {
            if(c != '+'){
                num[index] = Character.getNumericValue(c);
                index++;
            }
        }
        
        Arrays.sort(num);
        for (int i = 0; i < num.length - 1; i++) {
            System.out.print(num[i]+"+");
        }
        System.out.println(num[num.length - 1]);
    }
    
}
