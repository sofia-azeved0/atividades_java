public class conta_bancaria {
    String numeroConta;
    double saldo;

    public conta_bancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valorD) {
        this.saldo += valorD;
    }

    public void sacar(double valorS) {

        if (this.saldo >= valorS) {
            this.saldo -= valorS;
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }
}
