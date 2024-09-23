public class Aluno {
        private String nome;
        private int matricula;
        private double nota1, nota2, nota3, nota4;
        private double media;

        public Aluno(String nome, int matricula, double nota1, double nota2, double nota3, double nota4){
            this.nome = nome;
            this.matricula = matricula;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
            this.nota4 = nota4;
        }

        public void calcularMedia(double nota1, double nota2, double nota3, double nota4){
            media = (nota1 + nota2 + nota3 + nota4)/4;
            if(media >= 60){
                System.out.println("Aluno Aprovado!");
            }
            else if (media >= 30){
                System.out.println("Recuperação!");
            }
            else{
                System.out.println("Reprovado!");
            }
        }
}
