/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dracoliano
 */
public class Simplificador {
    public static void main(String[] args) {
        //entrada de valores
        int numerador = 2,
            denominador = 7;     
        
        for (int i = 1; i <= numerador; i++){
            if (numerador%i == 0 && denominador%i ==0){
               numerador /= i;
               denominador /= i;
           }
            else{
                System.out.println("erro");
            }
        }        
	System.out.println("O valor da fração simplificada é: " + numerador + "/" + denominador);
    }
}
