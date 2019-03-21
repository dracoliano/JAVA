/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dracoliano
 */
public class Multiplos {
    public static void main (String[]arg){
        int num1 = 5;
        int num2 = 10;
        
        if (num1%num2 == 0 || num2%num1 == 0){
            System.out.println("Os valores são multiplos entre si"); 
        }
        else{
            System.out.println("Os valores não são multiplos entre si");  
        }
    }
}
