public class produto {
    String nome;
    double preco;

    public produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual /100);
    }
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
}
