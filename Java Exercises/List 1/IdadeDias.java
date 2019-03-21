/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dracoliano
 */
public class IdadeDias {
    public static void main (String[]arg){
        int idade = 21;
        int meses = 4;
        int dias = 30;
        int result = (idade*365)+ (meses * 30) + dias;
        System.out.println("Você possui "+result+" dias de vida.");
    }
}
