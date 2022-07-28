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
public class AdjacentReplacement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> list = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        
        //Collections.sort(list);
//        long max = Collections.max(list);
//        long min = Collections.min(list);
//        for (long i = min; i <= max; i++) {
//            long x = i;
//            for (int j = 0 ; j < n; j++) {
//                if(x == list.get(j)){
//                    if(x%2 != 0){
//                        list.set(j, x+1);
//                    }
//                    else{
//                        list.set(j, x-1);
//                    }
//                }
//            }
//        }
        
        for (int i = 0; i < n; i++) {
            long x = list.get(i);
            if(x%2 == 0){
               list.set(i, x-1);
            }
        }
        
        for (long i : list) {
            System.out.println(i+" ");
        }
    }
    
}
