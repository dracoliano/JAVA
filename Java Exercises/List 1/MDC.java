/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dracoliano
 */
public class MDC {
    public static void main(String[]arg){
        int mdc = 0, numero1 = 16, numero2 = 24;
        
        for(int i=1; i<=numero1; i++){
            if (numero1%i == 0 && numero2%i == 0){
                mdc = i;
            }
        }
        System.out.println("O M.D.C entre "+numero1+" e "+numero2+" é "+mdc);
    }
}
