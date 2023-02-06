package TorneioNatacao;

public class Torneio {
public static void main(String[] args) {
    String nome = "Participante";
    int idade =18;
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