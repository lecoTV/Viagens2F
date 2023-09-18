public class Turista {
    // Atributos - Variáveis de instância
    private String nome;
    private String cpf;
    //Construtor Padrão
    Turista(){
        // Atributos - Variáveis
    }
    // Sobrecarga do Construtor personalizado
    Turista(String _nome){
        this.nome = _nome;
    }
    // Mais uma sobrecarga do construtor
    Turista (String _nome,String _cpf) {
        this.nome = _nome;
        this.cpf = _cpf;
    }

    // Métodos
    public String viajar(){
        return "Viajou!!!";
    }
    //  Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // Validar CPF

        this.cpf = cpf;
    }
}
