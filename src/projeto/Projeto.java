
package projeto;

import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        
        String nome, proximo = "sim";
        double n1, n2, n3, media;
        
        while (proximo.equals("sim")){
        Scanner input = new Scanner(System.in);
        //código abaixo que pede para imprimir na tela.
        System.out.println("Informe o nome do Aluno:");
        nome = input.next();
        
        System.out.println("Informe a primeira nota do aluno: ");
        n1 = input.nextDouble();
        
        System.out.println("Informe a segunda nota do aluno: ");
        n2 = input.nextDouble();
        
        System.out.println("Informe a terceira nota do aluno: ");
        n3 = input.nextDouble();
        
        media = (n1 + n2 + n3)/3;
        
        System.out.println("Nome do aluno:" + nome);
        System.out.println("Primeira nota do aluno" + n1);
        System.out.println("Segunda nota do aluno" + n2);
        System.out.println("Terceira nota do aluno" + n3);
        System.out.println("Média do aluno: " + media);
        System.out.println("Deseja continuar ? (sim/não)");
        proximo = input.next();
        
      }
    }
}
