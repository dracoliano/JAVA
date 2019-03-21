import java.util.Scanner;

/**
 *
 * @author Dracoliano
 */
public class VolumeCubo {
    public static void main(String[] args) {
        double lado;
        
        System.out.println("Informe o lado do cubo");
        Scanner entrada = new Scanner(System.in);
        
        lado = entrada.nextDouble();
        lado = Math.pow(lado,3);
        
        System.out.println("O volume do cubo é: "+lado+" cm³");
    }
}
