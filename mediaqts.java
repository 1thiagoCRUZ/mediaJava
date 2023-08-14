import java.util.Scanner;

public class mediaqts {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
       
        String nome; 
        double nota1, nota2; 

        System.out.println("Informe o nome do aluno: ");
        nome = in.nextLine();

        System.out.println("Informe a primeira nota do "+nome + " :");
        nota1 = in.nextDouble();

        System.out.println("Informe a segunda nota do "+nome + " :");
        nota2 = in.nextDouble();

        

        while(nota1 > 10 || nota1 < 0 || nota2 > 10 || nota2 < 0){
             System.out.println("Informe a primeira nota do "+nome + " novamente:");
             nota1 = in.nextDouble();

             System.out.println("Informe a segunda nota do "+nome + " novamente:");
             nota2 = in.nextDouble();

             
        }
        double media = (nota1 + nota2)/2;


        if (media < 3){
            System.out.println("O aluno "+nome + " teve média " + media + " e está reprovado!");
        }
        else if(media >= 3 && media < 6){
            System.out.println("O aluno "+nome +" teve média " + media + " está de recuperação!");
        }
        else if (media >= 6){
            System.out.println("O aluno "+nome +" teve média " + media + " está aprovado!");
        }
        
    }
}