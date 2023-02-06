package TorneioNatacao;

import java.util.Scanner;

public class Torneio {
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Digite o nome do Participante: ");
        String nome = input.next();
        System.out.println("Digite a idade do participante aqui: ");
        int idade = input.nextInt();
        if(idade < 10){
            System.out.println(nome + " Participara da Categoria Infantil");
        } else if(idade >= 11 && idade <= 15){
            System.out.println(nome + " Participara da Categoria Juvenil");
        } else if (idade >= 16 && idade <= 19){
            System.out.println(nome + " Participara da Categoria Pre-Adulto");
        } else{
            System.out.println(nome + " Participara da Categoria Adulto");
        }
    }
}
}