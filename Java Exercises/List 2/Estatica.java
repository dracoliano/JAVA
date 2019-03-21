/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dracoliano
 */
public class Estatica {

    static void eco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //LETRA A
     void eco(String s){
        for (int i=0; i<2;i++){
            System.out.println("s");
        }
    }
    
    //LETRA B
      void ecoN(int n, String s){
        for (int i=0; i<n; i++){
            System.out.println("s");
        }
    }
     
     //LETRA C
      boolean par (int n){
         return n%2 == 0;
     }
     
     //LETRA D
      int volume (int x, int y, int z){
         return x*y*z;
     }
     
     //LETRA E
      int maior (int a, int b){
         if (a>b){
             return a;
         }
         else{
             return b;
         }
     }
     
     //LETRA F
      void somaVetor (int n[], int valor) {
         for (int i=0; i<n.length; i++){
             valor += n[i];
         }
    }
     
     //LETRA G
     double volumeEsfera(double r){
        return 3.14 * Math.pow(r,2);
     }
     
     //lETRA H
     boolean primo(int n){
         for (int i=0; i<=n; i++){
             return n%i ==0;
         }
         return false;
     }
     
     //LETRA I
       double []  equacao2Grau( double a, double b, double c){
         double[] vetor = new double [2];
          vetor [0] = ((-b)+ (Math.sqrt(Math.pow(b,2)-4*(a*c)))/2*a);
          vetor [1] =((+b)+ (Math.sqrt(Math.pow(b,2)-4*(a*c)))/2*a);
         if (vetor[0]-vetor[1] <= 0){
             return null;
         }
         return vetor;
      }
}
