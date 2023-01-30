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
public class GoodContest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        while(n-- > 0){
            String s = sc.next();
            int b = sc.nextInt();
            int a = sc.nextInt();
            if(b >= 2400 && a > b){
                flag = true;
            }
        }
        
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
