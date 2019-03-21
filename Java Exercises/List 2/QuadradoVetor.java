import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dracoliano
 */
public class QuadradoVetor {
    public static void main(String[] args) {
        int [] valores = new int[6];
        
        for (int i=1; i<valores.length; i++){
            System.out.println("Digite o "+i+" valor");
            Scanner entrada = new Scanner(System.in);
            valores[i] = entrada.nextInt();
        }
        for (int i=1; i<valores.length; i++){
            System.out.println(valores[i]+" = "+Math.pow(valores[i],2));
        }
    }
}
