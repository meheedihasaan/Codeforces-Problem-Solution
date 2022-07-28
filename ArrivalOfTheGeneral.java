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
public class ArrivalOfTheGeneral {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = 0;
        int min = 101;
        int maxIn = 0, minIn = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            
            if(arr[i] > max){
                max = arr[i];
                maxIn = i;
            }            

            if(arr[i] <= min){
                min = arr[i];
                minIn = i;
            }
        }
        
        if (maxIn > minIn) {
            minIn+=1;
        }
        System.out.println(maxIn+(n-1)-minIn);
        
        //Algorithm: Index of Max Height(MaxIn) + Max Index(n-1) - Index Of Min Height(MinIn)
    }
    
}
