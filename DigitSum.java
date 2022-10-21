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
public class DigitSum {
    
//    static int arr[] = new int[100000002];
//    public static int digitSum(int num){
//        int sum = 0;
//        while(num != 0){
//            int rem = num%10;
//            sum+=rem;
//            num/=10;
//        }
//        return sum;
//    }
//    
//    public static void preLoad(){
//        for (int i = 1; i <= 1000000002; i++) {
//            int x = digitSum(i);
//            int y = digitSum(i+1);
//            if(y < x){
//                arr[i] = arr[i-1]+1;
//            }
//            else{
//                arr[i] = arr[i-1];
//            }
//        }
//    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            n++;
            System.out.println(n/10);
        }
    }
    
}
