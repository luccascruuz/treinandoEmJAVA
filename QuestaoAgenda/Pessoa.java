package QuestaoAgenda;

import java.util.Objects;

public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected String CPF;
    protected String idade;

    public Pessoa(String nome, String sobrenome, String CPF, String idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.idade = idade;
    }
    
    public String getNomeCompleto(){
        String NomeCompleto = nome + " " + sobrenome;
        return NomeCompleto;
    }
    public String getCPF() {
        return CPF;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) &&
                Objects.equals(sobrenome, pessoa.sobrenome) &&
                Objects.equals(CPF, pessoa.CPF);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
