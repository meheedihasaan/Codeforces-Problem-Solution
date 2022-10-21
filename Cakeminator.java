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
public class Cakeminator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] ch = new char[n][m];
        for (int i = 0; i < n; i++) {
            ch[i] = sc.nextLine().toCharArray();
        }
       
        int cell = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) { 
            flag = true;
            for (int j = 0; j < m; j++) {
                if(ch[i][j] == 'S'){
                    flag = false;
                    break;
                }
            }
            if(flag){
                for (int j = 0; j < m; j++) {
                    ch[i][j] = 'e';
                    cell++;
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            flag = true;
            for (int j = 0; j < n; j++) {
                if(ch[j][i] == 'S'){
                    flag = false;
                    break;
                }
            }
            if(flag){
                for (int j = 0; j < n; j++) {
                    if(ch[j][i] == '.'){
                        cell++;
                    }
                }
            }
        }
        System.out.println(cell);
        
    }
    
}
