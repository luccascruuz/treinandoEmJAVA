package QuestaoAgenda;

public class Agenda {
    protected Pessoa[] pessoas = new Pessoa[10];
    protected int qtdPessoa;

    public void addPessoa(Pessoa pessoa){
        for (int i = 0; i <qtdPessoa ; i++) {
            if (pessoa.getCPF().equals(pessoas[i].getCPF())){
                return;
            }
        }
        if (qtdPessoa == pessoas.length) {
            try {
                pessoas[qtdPessoa] = pessoa;

            } catch (ArrayIndexOutOfBoundsException e) {
                Pessoa[] p2 = new Pessoa[(pessoas.length)*2];
               int cont = 0;
               Exrecu dobrarvet = new Exrecu();
               dobrarvet.preencher(pessoas, p2, cont);
                pessoas=p2;
            }
        }
        if (pessoa instanceof Filho){
            for (int i = 0; i <qtdPessoa ; i++) {
                if (((Filho)pessoa).CPFMae.equals(pessoas[i].CPF)){
                    pessoas[qtdPessoa] = pessoa;
                    qtdPessoa++;
                    return;
                }
            }
            System.out.println("Cpf da mãe não existente");
        }
        else{
            pessoas[qtdPessoa] = pessoa;
            qtdPessoa++;
        }
    }
    public void listar(){
        for (int i = 0; i <qtdPessoa ; i++) {
            System.out.println(pessoas[i].toString());
        }
    }
    public boolean RemoverPessoas(String cpf){
        for (int i = 0; i <qtdPessoa ; i++) {
            for (int j = 0; j <qtdPessoa ; j++) {
                if (pessoas[j] instanceof Filho) {
                    if (((Filho) pessoas[j]).CPFMae.equals(cpf)) {
                        pessoas[j] = pessoas[qtdPessoa - 1];
                        qtdPessoa--;
                    }
                }
            }
            if (cpf.equals(pessoas[i].getCPF())){
                pessoas[i] = pessoas[qtdPessoa-1];
                qtdPessoa--;
            }
        }
        return false;
    }
    public void filhosdamae(String cpf) {
        for (int i = 0; i < qtdPessoa; i++) {
            if (pessoas[i] instanceof Filho) {
                if (((Filho) pessoas[i]).CPFMae.equals(cpf)) {
                    System.out.println(pessoas[i].toString());
                }
            }
        }
        return;
    }
    public void todosfilhos(){
        for (int i = 0; i <qtdPessoa ; i++) {
            if (pessoas[i] instanceof Filho){
                System.out.println(pessoas[i].toString());
            }
        }
        return;
    }
    public void naotemfilho(){
        for (int i = 0; i <qtdPessoa ; i++) {
            for (int j = 0; j <qtdPessoa ; j++) {
                if (!(pessoas[i].getCPF().equals(((Filho)pessoas[j]).getCPFMae()))){
                    System.out.println(pessoas[i].toString());
                }
            }
        }
        return;
    }
    
}
