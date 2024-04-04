package media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double nota = 0;

        Scanner leitura = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice"));
        pessoas.add(new Pessoa("Bob"));
        pessoas.add(new Pessoa("Carol"));

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
            System.out.println("Digite uma nota: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

    leitura.close();
    
    System.out.println("Média de avaliação: " + mediaAvaliacao / 3);

    }

    public static class Pessoa {
        private String nome;
    
        public Pessoa(String nome) {
            this.nome = nome;
        }
    
        public String getNome() {
            return nome;
        }
    }
       
}
