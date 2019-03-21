//Código por Henrique Felipe (GitHub: HenriqueIni)
public class MMC {
    //Algoritmo de Euclides iterativo
    private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    //Algoritmo do MMC
    private static int mmc(int a, int b){
        return a * (b / mdc(a, b));
    }
    //Testes
    public static void main(String[] args) {
        System.out.println("MMC");
        System.out.printf("mmc(30, 60) = %d\n", mmc(30, 60));
    }    
}