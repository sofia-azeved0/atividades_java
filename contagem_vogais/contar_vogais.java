public class contar_vogais {
    public static void main(String[] args) {
        String texto = ("Ola, eu me chamo Sofia e estou aprendendo Java. Estou muito feliz por isso!");
        char[] caracteres = {'a', 'e', 'i', 'o', 'u'};
        int contar_vogais = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
           
            for (char caractere : caracteres) {
                if (letra == caractere) {
                    contar_vogais++;
                    break;
                }
            }

            }

        System.out.println("Número de vogais no texto: " + contar_vogais);
    }
        
}