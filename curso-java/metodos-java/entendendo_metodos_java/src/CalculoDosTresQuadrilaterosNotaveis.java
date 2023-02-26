public class CalculoDosTresQuadrilaterosNotaveis {
    /*
        Criar uma aplicação que calcula a área dos 3 quadriláteros
        notáveis: quadrado, retangulo e trapézio.

     */

    public static void calcularAreaDoQuadrilatero(int a){
        int area = (a * a);
        System.out.println("A área do quadrado é: "+area);
    }
    public static void calcularAreaDoQuadrilatero(double base, double altura){
        double area = (base * altura);
        System.out.printf("A área do retagulo é %.2f\n",area);
    }

    public static void calcularAreaDoQuadrilatero(double baseMaior, double baseMenor, double altura){
        double area = ((baseMaior + baseMenor) * altura)/2;
        System.out.printf("A área do trapézio é %.2f\n",area);
    }
}
