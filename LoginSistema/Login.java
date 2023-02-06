package LoginSistema;

import java.util.Scanner;

public class Login {
public static void main(String[] args) {
    try (Scanner login = new Scanner(System.in)) {
        System.out.println("Digite seu Login aqui: ");
        String id = login.next();
        if(id.equals("") || id.equals(null)){
            System.out.println("Usuario Invalido");
        } else if (id.equalsIgnoreCase("admin") || id.equalsIgnoreCase("administrador")){
            System.out.println("Usuario Invalido");
        } else {
            System.out.println(id + " cadastrado com sucesso");
        }
    }
    }
} 