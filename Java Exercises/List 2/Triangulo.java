/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dracoliano
 */
public class Triangulo {
    public static void main(String[] args) {
        //entrada de valores
        int lado1 = 8,
            lado2 = 2,
            lado3 = 1;
        //triangulos
        boolean equilatero = lado1 == lado2 && lado1 == lado3,
                isoceles = lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado3 != lado2 || lado3 == lado2 && lado2 != lado1,
                escaleno = lado1 != lado2 && lado2 != lado3 && lado1 !=lado3;
        
        if (equilatero){
            System.out.println("Triangulo Equilatero");
        }
        if  (isoceles){
            System.out.println("Triangulo Isóceles");
        }
        if (escaleno){
            System.out.println("Triangulo Escaleno");
        }
        else{
            System.out.println("Não é um triângulo");
        }
    }
}
