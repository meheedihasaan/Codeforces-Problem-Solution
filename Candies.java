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
public class Candies {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int z = n%m;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            if(n%m == 0){
                arr.add(n/m);
            }
            else{
                if(z > 0){
                    arr.add((n/m)+1);
                    z--;
                }
                else{
                    arr.add(n/m);
                }
            }
        }

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    
}
