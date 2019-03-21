import java.util.Scanner;

/**
 *
 * @author Dracoliano
 */
public class NumeroMaiores {
    public static void main(String[] args) {
        double [] valores = new double [6];
        double media = 0;
        
        
        for (int i=1; i<valores.length;i++){
            System.out.println("Digite o "+i+" Valor");
            Scanner entrada = new Scanner(System.in);
            valores[i] = entrada.nextDouble();
        }
        for (int i=1; i<valores.length;i++){
            media+= valores[i];
            if (valores[i] > media/i){
                System.out.println("O elemento "+valores[i]+" é maior que a sua média aritmética : "+media/i);
            }
        }

    }
}
