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
public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            String s = input.next();
            if(s.equals("Tetrahedron")){
                count+=4;
            }
            else if(s.equals("Cube")){
                count+=6;
            }
            else if(s.equals("Octahedron")){
                count+=8;
            }
            else if(s.equals("Dodecahedron")){
                count+=12;
            }
            else if(s.equals("Icosahedron")){
                count+=20;
            }
        }
        System.out.println(count);
    }
}
