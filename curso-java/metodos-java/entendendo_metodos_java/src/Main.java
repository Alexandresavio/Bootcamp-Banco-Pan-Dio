public class Main {

    public static void main(String[] args) {
       //chamando os metodos  da classe CalculadoraSimples (sem retorno)
       CalculadoraSimples.somarInteiro(5,4);
       CalculadoraSimples.subtrairInteiros(2,1);
       CalculadoraSimples.multiplicarInteiros(5,5);
       CalculadoraSimples.dividirReais(5,2);

        //chamando os metodos  da classe Menssagem (sem retorno)
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //chamando os metodos  da classe emprestimo (sem retorno)
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        //chamando os métodos da classe CalculoDosTresQuadrilaterosNotaveis (sem retorno)
        CalculoDosTresQuadrilaterosNotaveis.calcularAreaDoQuadrilatero(5);
        CalculoDosTresQuadrilaterosNotaveis.calcularAreaDoQuadrilatero(5,2.5);
        CalculoDosTresQuadrilaterosNotaveis.calcularAreaDoQuadrilatero(24, 9, 15);

        //chamando os métodos da classe QuadrilateroComRetorno
        int areaQuadrado = QuadrilaterosComRetorno.calcularQuadrado(6);
        System.out.println("A área do quadrado é: "+areaQuadrado);

        double areaRetangulo = QuadrilaterosComRetorno.calcularRetangulo(8,3.5);
        System.out.printf("A área do retagulo é %.2f\n",areaRetangulo);

        double areaTrapezio = QuadrilaterosComRetorno.calcularTrapezio(24,6,15);
        System.out.printf("A área do trapézio é %.2f\n",areaTrapezio);
    }
}