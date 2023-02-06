package AlistamentoMilitar;

import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite seu sexo: ");
            String sexo = input.next();
            if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
            System.out.println("Digite sua idade: ");
            int idade = input.nextInt();
            if(idade < 18){
                System.out.println("Alistamento nao Permitido");
            } else {
                System.out.println("Alistamento Obrigatorio");
            }
   }
        }
}
}