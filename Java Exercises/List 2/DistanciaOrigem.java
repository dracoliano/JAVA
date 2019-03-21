import java.util.Scanner;

/**
 *
 * @author Dracoliano
 */
public class DistanciaOrigem {
    public static void main(String[] args) {
        double a, b, resultado;
        
        System.out.println("Informe o ponto de A");
        Scanner entradaA = new Scanner(System.in);
        a = entradaA.nextDouble();
        
        
        System.out.println("Informe o ponto de B");
        Scanner entradaB = new Scanner(System.in);
        b = entradaB.nextDouble();
        
        resultado = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
        System.out.println(resultado);
    }
          
}
