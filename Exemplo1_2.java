package exercicios;
public class Exemplo1_2{
    
    //Passagem por valor
    public static int dobra(int numero){
        return numero*2;
    }
    
    public static void main(String[]args){
        int numero = 20;
        
    System.out.println("Valor atual: " + numero);
    System.out.println("Dobrando o valor.");
    dobra(numero);
    System.out.println("Valor dobrado: " + numero);
    }
    
    
}