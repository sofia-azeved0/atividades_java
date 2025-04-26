public class carro {

    String marca;
    String modelo;
    int ano;

    public carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", modelo: " + modelo + ", ano: " + ano);

    }
}
