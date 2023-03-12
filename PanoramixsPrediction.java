/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class PanoramixsPrediction {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();   
        for (int i = n+1; i <= m; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                arr.add(i);
            }
        }
        
        if(arr.isEmpty()){
            System.out.println("NO");
        }
        else if(arr.get(0) == m){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
