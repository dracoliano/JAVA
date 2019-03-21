import java.util.Scanner;

/**
 *
 * @author Dracoliano
 */
public class DistanciaPonto {
    public static void main(String[] args) {
        double a1, a2, b1, b2, resultado;
        
        System.out.println("Informe o 1º ponto de A");
        Scanner entradaA1 = new Scanner(System.in);
        a1 = entradaA1.nextDouble();
        
        System.out.println("Informe o 2º ponto de A");
        Scanner entradaA2 = new Scanner(System.in);
        a2 = entradaA2.nextDouble();
        
        System.out.println("Informe o 1º ponto de B");
        Scanner entradaB1 = new Scanner(System.in);
        b1 = entradaB1.nextDouble();
        
        System.out.println("Informe o 2º ponto de B");
        Scanner entradaB2 = new Scanner(System.in);
        b2 = entradaB2.nextDouble();
        
        resultado = Math.sqrt(Math.pow(a1-a2,2) + Math.pow(b1-b2, 2));
        System.out.println(resultado);
    }
          
}
