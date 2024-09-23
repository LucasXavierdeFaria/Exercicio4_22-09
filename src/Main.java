import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Bem vindo ao sistema de Aluno-----");

        System.out.println("Digite o nome do Aluno:");
        String nome = scanner.next();

        System.out.println("Digite a Matricula do Aluno: ");
        int matricula = scanner.nextInt();

        System.out.println("Digite a note do primeiro bimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota do segundo bimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota do terceiro bimestre: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a nota do quarto bimestre: ");
        double nota4 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3, nota4);

        aluno.calcularMedia(nota1, nota2, nota3, nota4);

        System.out.println("Obrigado por utilizar o novo sistema!");
        scanner.close();

    }
}