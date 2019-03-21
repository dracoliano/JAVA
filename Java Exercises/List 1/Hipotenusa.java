/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dracoliano
 */
public class Hipotenusa {
    public static void main(String[]arg){
        double catetoA = 3;
        double catetoB = 4;   
        double result = Math.sqrt(Math.pow(catetoA, 2)+ Math.pow(catetoB, 2));
        System.out.println("Os valores recebibos foram: Cateto A = "+ catetoA + " , Cateto B = " + catetoB);
        System.out.println("O valor da hipotenusa é: " + result);
    }
}
