package CadastroPessoa;

public class Aluno extends Pessoa{

    public String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public Aluno(String nome, String sobrenome, String dataNasc, String rg, int telefones, int idade, String matricula) {
        super(nome, sobrenome, dataNasc, rg, telefones, idade);
        this.matricula = matricula;
    }
}
