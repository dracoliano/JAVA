/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dracoliano
 */
public class Fatorial {
    public static void main (String[]arg){
        for (int i = 1, fatorial = 1; i <= 5; i++) {			
                fatorial *= i;
                System.out.println("fatorial de " + i + " eh: " + fatorial);
        }
    }
}
