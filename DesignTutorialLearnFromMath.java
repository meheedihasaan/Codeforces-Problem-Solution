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
public class DesignTutorialLearnFromMath {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n%2 == 0){
            System.out.print(8+" "+(n-8));
        }
        else{
            System.out.print(9+" "+(n-9));
        }
    }
    
}
