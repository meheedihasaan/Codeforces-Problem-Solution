/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package R849_Div4;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class PrependAndAppend {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            if(n == 1){
                System.out.println(1);
                continue;
            }
            int l = 0;
            int r = n-1;
            while(l < r){
                if(s.charAt(l) != s.charAt(r)){
                    l++;
                    r--;
                }
                else{
                    break;
                }
            }
            
            if(l == r){
                System.out.println(1);
            }
            else if(l > r){
                System.out.println(0);
            }
            else{
                System.out.println((r-l)+1);
            }
        }
    }
    
}
