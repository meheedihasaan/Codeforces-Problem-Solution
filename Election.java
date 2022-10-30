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
public class Election {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
            sum+=arr.get(i);
        }

        long max = Collections.max(arr);
        while((max*n)-sum <= sum){
            max++;
        }

        System.out.println(max);
    }
    
}
