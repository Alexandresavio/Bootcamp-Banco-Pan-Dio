public class CalculadoraSimples {
    /*
     * Calcule as 4 operações básicas: soma, subtração, multiplicação, divisão. Sempre
     * 2 valores devem ser passados.
     */

    public static void somarInteiro(int numero1, int numero2){
        int resultado = (numero1 + numero2);
        System.out.printf("A soma entre os números %d e %d é igual a: %d \n",numero1,numero2,resultado);
    }

    public static void subtrairInteiros(int numero1, int numero2){
        int resultado = (numero1 - numero2);
        System.out.printf("A subtração entre os números %d e %d é igual a: %d\n",numero1,numero2,resultado);
    }

    public static void multiplicarInteiros(int numero1, int numero2){
        int resultado = (numero1 * numero2);
        System.out.printf("A multiplicação entre os números %d e %d é igual a: %d \n",numero1,numero2,resultado);
    }

    public static void dividirReais(double numero1, double numero2){
        double resultado = (numero1 / numero2);
        System.out.printf("A divisão entre os números %.1f e %.1f é igual a: %.1f \n",numero1,numero2,resultado);
    }

}
