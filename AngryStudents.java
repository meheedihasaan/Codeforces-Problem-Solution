/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class AngryStudents {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(0);
            for (int i = 0; i < n; i++) {
                int count = 0;
                if(s.charAt(i) == 'A'){
                    for (int j = i+1; j < n; j++) {
                        if(s.charAt(j) == 'P'){
                            count++;
                        }
                        if(s.charAt(j) == 'A'){
                            arr.add(count);
                            count = 0;
                            break;                           
                        }
                    }
                }
                if(count > 0){
                    arr.add(count);
                }
                i+=count;
            }
//            for (int i = 0; i < arr.size(); i++) {
//                System.out.print(arr.get(i)+" ");
//            }
            System.out.println(Collections.max(arr));
        }
    }
    
}
