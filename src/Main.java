import CadastroPessoa.Aluno;
import CadastroPessoa.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Eduarda", "Santos", "02/01/2006", "3132133213"
                ,132131233, 12, "1312314546");

        aluno1.getNome();
        aluno1.getMatricula();
        aluno1.getDataNasc();
        aluno1.getIdade();
        aluno1.getRg();
        aluno1.getSobrenome();
        aluno1.getTelefones();
        aluno1.idade = 20;
        aluno1.matricula = "1213132131 ";



        System.out.println("Nome: " + aluno1.getNome() + " " + aluno1.getSobrenome() + "\n" + "Idade: " + aluno1.idade + "\n"
                + "Matricula: " + aluno1.matricula + "\n" + "RG: " + aluno1.getRg());




    }
}