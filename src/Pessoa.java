public class Pessoa {
    private String nome;
    private int RG;

    public Pessoa(String nome, Integer RG) {
        this.nome = nome;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    @Override
    public boolean equals(Object obj) {
        // Verificar se o objeto passado é do tipo Pessoa
        if(this == obj) {
            return true;
        // Verifica se o objeto é nulo e da mesma classe Pessoa
        } if ((obj == null) || this.getClass() != obj.getClass()) {
            return false;
        }
        // Objeto passado é uma pessoa
        // Instanciar uma nova pessoa para comparar o atributo RG
        Pessoa pessoa = (Pessoa)obj;

        // Retorna se o RG do objeto recebido é igual ao da Pessoa atual
        return pessoa.getRG() == this.getRG();
    }
}
