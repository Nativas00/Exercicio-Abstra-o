package com.mycompany.teste;

class ProvaUniversidade{
    protected double nota1;
    protected double nota2;
    
    public ProvaUniversidade(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }
}

class ProvaUCB extends ProvaUniversidade{
    public ProvaUCB(double nota1, double nota2){
        super(nota1, nota2);
    }
    public boolean aprovado(){
        return calcularMedia() >= 7;
    }
}

class ProvaFafifo extends ProvaUniversidade{
    public ProvaFafifo(double nota1, double nota2){
        super(nota1, nota2);
    }
    public boolean aprovado(){
        return calcularMedia() >= 6;
    }
}

public class Teste {
    public static void main(String[] args){
        ProvaUCB AlunoUCB = new ProvaUCB (7.5, 6.5);
        ProvaFafifo AlunoFafifo = new ProvaFafifo (6.0, 5.5);
        
        System.out.println("Aluno UCB foi:");
        if (AlunoUCB.aprovado()){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
        
        System.out.println("Aluno Fafifo foi:");
        if (AlunoFafifo.aprovado()){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}