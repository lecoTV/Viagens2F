import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe Objeto = Construtor
        Turista mochileiro = new Turista("Lindsay");
        Turista mochileira = new Turista();
        // Definir forma de cada turista
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileira.setNome("Namor");
        mochileira.setCpf("456");
        // Definir comportamento
        String retorno = mochileira.viajar();
        JOptionPane.showMessageDialog(null,retorno);
        // Atribuição dinâmica
        String nome = JOptionPane.showInputDialog("Entre com o nome da pessoa Turista:");
        // Criação do objeto - nome armazenado acima
        Turista pessoaTurista = new Turista(nome);
        // Saída de dados - nome armazenado acima
        System.out.println(pessoaTurista.getNome());

        // Pedir CPF e mostrar
        String cpf = JOptionPane.showInputDialog("entre com CPF da pessoa turista:");
        pessoaTurista.setCpf(cpf);
        System.out.println(pessoaTurista.getCpf());

        if(Validacao.cpf(cpf)){
            pessoaTurista.setCpf(cpf);
            System.out.println(pessoaTurista.getCpf());
        } else {
            System.out.println("CPF inválido!");
        }



    }
}