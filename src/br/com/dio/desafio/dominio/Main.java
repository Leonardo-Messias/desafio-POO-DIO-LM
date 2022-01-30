package br.com.dio.desafio.dominio;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java", "Curso Java POO",120);
        Mentoria mentoria = new Mentoria();

        System.out.println(curso);
    }
}
