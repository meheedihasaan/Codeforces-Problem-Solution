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
public class BoringApartments {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int d = n%10;
            int count = 0;
            while(n != 0){
                n = n/10;
                count++;
            }
            if(count == 1){
                System.out.println((d-1)*10+1);
            }
            else if(count == 2){
                System.out.println((d-1)*10+3);
            }
            else if(count == 2){
                System.out.println((d-1)*10+3);
            }
            else if(count == 3){
                System.out.println((d-1)*10+6);
            }
            else if(count == 4){
                System.out.println((d-1)*10+10);  
            }              
        }
    }
    
}
