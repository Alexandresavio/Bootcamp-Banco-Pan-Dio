public class Main {

    public static void main(String[] args) {
       //chamando os metodos  da classe CalculadoraSimples
       CalculadoraSimples.somarInteiro(5,4);
       CalculadoraSimples.subtrairInteiros(2,1);
       CalculadoraSimples.multiplicarInteiros(5,5);
       CalculadoraSimples.dividirReais(5,2);

        //chamando os metodos  da classe Menssagem
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //chamando os metodos  da classe emprestimo
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}