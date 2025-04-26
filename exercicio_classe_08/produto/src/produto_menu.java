public class produto_menu {
    public static void main(String[] args) {
        produto pr01 = new produto("Camisa", 100.0);
        System.out.println("Preço original: R$" + pr01.getNome());

        pr01.aplicarDesconto(20);

        System.out.println("Preço com desconto: R$" + pr01.getPreco());
    }
}
