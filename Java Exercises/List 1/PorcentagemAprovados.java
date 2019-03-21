/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dracoliano
 */
import java.util.Scanner;

public class PorcentagemAprovados {
    public static void main (String[]arg){
        int numeroDeMedias, aprovados = 0;
        double notaA, notaB, media;
        
        Scanner quantidade = new Scanner(System.in);
        System.out.println("Digite a quantidade de médias que deseja calcular");
        numeroDeMedias = quantidade.nextInt();
        
        for(int i=1; i<=numeroDeMedias; i++){
            
            Scanner entradaNotaA = new Scanner(System.in);
            System.out.println("Aluno "+ i +" : Primeira Nota");
            notaA = entradaNotaA.nextDouble();
            
            Scanner entradaNotaB = new Scanner(System.in);
            System.out.println("Aluno "+ i +" : Segunda Nota");
            notaB = entradaNotaB.nextDouble();
            
            media = (notaA + notaB)/2;
           
            if (media >= 6){
                aprovados ++;
                System.out.println("Aluno "+ i+" APROVADO!");
            }
            else{ System.out.println("Aluno "+ i+" REPROVADO!");}
        }
           System.out.println("A média de alunos aprovados foi de "+ ((aprovados*100)/numeroDeMedias)+ "%"); 
    }
}
