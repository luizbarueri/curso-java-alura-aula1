public class Main {
    public static void main(String[] args) {

        String saudacao = "Olá, ";
        String nome = "Alura";
        String mensagem1 = saudacao + nome + "!";

        String mensagem = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;

        String senha = "12345";

        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado! " + mensagem1);
            System.out.println(mensagem);

        } else {
            System.out.println("Senha incorreta.");
        }

        String nome2 = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome2, idade, valor));

        String nome3 = "João";
        int aulas = 4;

        String mensagem2 = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome3, aulas);

        System.out.println(mensagem2);

    }
}