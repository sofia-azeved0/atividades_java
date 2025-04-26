public class ContaBancaria_menu {
    public static void main(String[] args) {

        conta_bancaria cb01 = new conta_bancaria ("cb01", 0);

        cb01.depositar(260);
        cb01.mostrarSaldo();

        cb01.sacar(320);
        cb01.mostrarSaldo();
    }
}
