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
public class SomaVetores {
    public static void main(String[] args) {
        int [] vetorA = new int[6];
        int [] vetorB = new int[6];
        int [] vetorAB = new int[6];
        
        
        for (int i=1; i<vetorA.length;i++){
            System.out.println("Digite o "+i+" valor do vetor A");
            Scanner entradaVetorA = new Scanner(System.in);
            vetorA[i] = entradaVetorA.nextInt();
        }
        for (int i=1; i<vetorB.length; i++){
            System.out.println("Digite o "+i+" valor do vetor B");
            Scanner entradaVetorB = new Scanner(System.in);
            vetorB[i] = entradaVetorB.nextInt();
        }
        for (int i=1; i<vetorAB.length; i++){
            vetorAB[i] = vetorA[i]+vetorB[i];
            System.out.println(vetorA[i] + " + " + vetorB[i] + " = " + vetorAB[i]);
        }
    }
}
