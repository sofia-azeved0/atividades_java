public class pessoa {

    String nome;
    int idade;
    int aniversario;

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void fazerAniversario () {
        aniversario = idade + 1;
    }
    public void idadeI() {
        System.out.println(nome + " tem " + idade + " anos.");
    }
    public void idadeN() {
        System.out.println(nome + " fez aniversário, e agora tem " + aniversario + " anos.");
    }
}
