package QuestaoAgenda;

import java.util.Objects;

public class Filho extends Pessoa {
    protected String CPFPai;
    protected String CPFMae;

    public Filho(String nome, String sobrenome, String CPF, String idade, String CPFMae) {
        super(nome, sobrenome, CPF, idade);
        this.CPFMae = CPFMae;
    }

    public Filho(String nome, String sobrenome, String CPF, String idade, String CPFMae, String CPFPai) {
        super(nome, sobrenome, CPF, idade);
        this.CPFMae = CPFMae;
        this.CPFPai = CPFPai;
    }


    public String getCPFPai() {
        return CPFPai;
    }
    public void setCPFPai(String CPFPai) {
        this.CPFPai = CPFPai;
    }
    public String getCPFMae() {
        return CPFMae;
    }
    public void setCPFMae(String CPFMae) {
        this.CPFMae = CPFMae;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Filho)) return false;
        if (!super.equals(o)) return false;
        Filho filho = (Filho) o;
        return Objects.equals(CPFPai, filho.CPFPai) &&
                Objects.equals(CPFMae, filho.CPFMae);
    }

    @Override
    public String toString() {
        return "Filho{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", idade='" + idade + '\'' +
                "CPFPai='" + CPFPai + '\'' +
                ", CPFMae='" + CPFMae + '\'' +
                '}';
    }
}
