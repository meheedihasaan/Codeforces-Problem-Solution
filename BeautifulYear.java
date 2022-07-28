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
public class BeautifulYear {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        for(;;){
            y++;
            int a = y/1000;
            int b = (y/100)%10;
            int c = (y/10)%10;
            int d = y%10;
            if(a != b && a != c && a != d && b != c && b != d && c != d){
                break;
            }
        }
        System.out.println(y);
    }
    
}

//Distinct digit is a unique digit
