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
public class DejaVu1 {
    
    //Is a string palindrome or not
    public static boolean isPalindrome(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String str = sc.next();
            boolean flag = false;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != 'a'){
                    flag = true;
                }
            }
            
            if(!flag){
                System.out.println("NO");
            }
            else{
                if(!isPalindrome(str+'a')){
                    System.out.println("YES");
                    System.out.println(str+'a');
                }
                else if(!isPalindrome('a'+str)){
                    System.out.println("YES");
                    System.out.println('a'+str);
                }
            }
        }
    }
    
}
