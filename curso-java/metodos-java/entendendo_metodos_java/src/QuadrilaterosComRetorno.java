public class QuadrilaterosComRetorno {

    /*   Criar uma aplicação que calcula a área dos 3 quadriláteros
     *   notáveis: quadrado, retangulo e trapézio.
     *   Observação: criar métodos com retorno
     */

    public static int calcularQuadrado(int a){
        return  (a * a);
    }

    public static double calcularRetangulo(double base, double altura){
        return (base * altura);
    }

    public static double calcularTrapezio(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura)/2;
    }

}
