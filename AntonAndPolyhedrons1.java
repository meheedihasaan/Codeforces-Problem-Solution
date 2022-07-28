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
public class AntonAndPolyhedrons1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            String s = input.next();
            switch (s) {
                case "Tetrahedron":
                    count+=4;
                    break;
                case "Cube":
                    count+=6;
                    break;
                case "Octahedron":
                    count+=8;
                    break;
                case "Dodecahedron":
                    count+=12;
                    break;
                case "Icosahedron":
                    count+=20;
                    break;
            }
        }
        System.out.println(count);
    }
}
