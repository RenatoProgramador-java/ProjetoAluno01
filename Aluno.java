package model;

public class Aluno {
    Double media;
    public double calcularMedia(double nota1, double nota2, double nota3){
        if((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)) {
            throw new ArithmeticException("ERRO. Numeros invalidos");
        }
        media = (nota1 + nota2 + nota3)/3;
        return (nota1 + nota2 + nota3)/3; // calculando a média
    }
    
    public String getSituacao(){
        if (media >= 7) {
            return"Aprovado";
        } else {
            if (media >= 5){
                return"Recuperação";
            } else {
                return"Reprovado";
            }
        }
    }
}
