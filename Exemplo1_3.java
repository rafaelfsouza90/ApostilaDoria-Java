package exercicios;
import java.util.Scanner;
public class Exemplo1_3{
    //for para array
    
    public static void main(String[]args){
        int [] numero = new int[5];
        int soma=0;
        Scanner entrada = new Scanner(System.in);
        
        for(int cont=0; cont < numero.length; cont ++){ //lenght mostra o tamanho da String
            System.out.print("Entre com o numero" + (cont+1)+ ": ");
            numero[cont] = entrada.nextInt();
        }
        
        //Exibindo e somando
        for (int cont : numero){
            soma += cont;     
        }
        System.out.println("A soma dos numeros que voce digitou e: " + soma);
    }
    
}