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
public class Codeforces_Checking {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "codeforces";
        int T = sc.nextInt();
        while(T-- > 0){
            String a = sc.next();
            if(s.contains(a)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
