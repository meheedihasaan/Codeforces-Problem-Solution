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
public class ExceptionHandling {
    
    public static int getInput(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }
    
    public static void main(String[] args) throws Exception {
        int x = getInput();
        try{
            if(x < 0){
                throw NegativeIntegerException("Number is negative");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    private static Exception NegativeIntegerException(String s) {
        throw new UnsupportedOperationException(s); //To change body of generated methods, choose Tools | Templates.
    }
    
}
