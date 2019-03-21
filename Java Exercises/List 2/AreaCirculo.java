import java.util.Scanner;

/**
 *
 * @author Dracoliano
 */
public class AreaCirculo {
    public static void main(String[] args) {
        double r;
        
        System.out.println("Digite o raio do círculo");
        Scanner entrada = new Scanner (System.in);
        
        r = entrada.nextDouble();
        r = 3.14 * Math.pow(r,2);
        
        System.out.println("A área do círculo é: " + r +" cm²");
    }
}
