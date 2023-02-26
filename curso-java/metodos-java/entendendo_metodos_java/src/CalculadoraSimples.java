public class CalculadoraSimples {
    /*
     * Calcule as 4 operações básicas: soma, subtração, multiplicação, divisão. Sempre
     * 2 valores devem ser passados.
     */

    public static void somarInteiro(int n1, int n2){
        int resultado = (n1 + n2);
        System.out.printf("A soma entre os números %d e %d é igual a: %d \n",n1,n2,resultado);
    }

    public static void subtrairInteiros(int n1, int n2){
        int resultado = (n1 - n2);
        System.out.printf("A subtração entre os números %d e %d é igual a: %d\n",n1,n2,resultado);
    }

    public static void multiplicarInteiros(int n1, int n2){
        int resultado = (n1 * n2);
        System.out.printf("A multiplicação entre os números %d e %d é igual a: %d \n",n1,n2,resultado);
    }

    public static void dividirReais(double n1, double n2){
        double resultado = (n1 / n2);
        System.out.printf("A divisão entre os números %.1f e %.1f é igual a: %.1f \n",n1,n2,resultado);
    }

}
