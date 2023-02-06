package CondicionaisIF;

public class CalculoDeSala {
public static void main(String[] args) {
    float salario = 2700.50F;
    float resultado = 0F;
    if(salario > 4500){
        resultado = salario * 0.3F;
        System.out.println("o Resultado de 30% e " +resultado);}
        else {
            resultado = salario * 0.1F;
            System.out.println("o Resultado de 10% e " +resultado);

        }
    }
}