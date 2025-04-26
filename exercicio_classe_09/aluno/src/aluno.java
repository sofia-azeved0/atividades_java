public class aluno {
    private String nome;
    private String matricula;

    public aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirInformacao() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }
}
