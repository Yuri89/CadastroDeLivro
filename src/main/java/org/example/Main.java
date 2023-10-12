package org.example;

import org.example.classes.Autor;
import org.example.classes.Livro;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> livroList = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);
        String opcao;

        System.out.println("Bem Vindo ao Sistema");

        do {

            System.out.println("\n cadastrar - 1 | listar - 2 | Sair - 0");
            opcao = leitor.next();
            switch (opcao){
                case "1" :

                    Livro novoLivro = new Livro();
                    Autor novoAutor = new Autor();
                    System.out.println("Cadastrar Livro\n");
                    System.out.println("_________________________________________________________________________________");

                    leitor.nextLine();
                    System.out.println("Nome do Autor");
                    novoAutor.nome = leitor.nextLine();


                    System.out.println("Data nascimento/ formato - (dd/mm/aaaa)");
                    novoAutor.localNasc = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    leitor.nextLine();
                    System.out.println(" Titulo do livro");
                    novoLivro.titulo = leitor.nextLine();


                    System.out.println(" Preço do livro");
                    novoLivro.preco = leitor.nextFloat();

                    System.out.println(" Data de lançamento/ formato - (dd/mm/aaaa)");
                    novoLivro.dataLancamento = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    Period lancamento = Period.between(novoLivro.dataLancamento, LocalDate.now());


                    if (lancamento.getYears() <= 5){
                        System.out.println(" "+novoLivro.dataLancamento+" Aprovado");
                    }else {
                        System.out.println(" Não pode ter menos de 5 anos");
                        break;
                    }

                    novoLivro.autor = novoAutor;
                    novoLivro.dataNascimento = novoAutor;


                    livroList.add(novoLivro);
                    System.out.println("_________________________________________________________________________________");
                    System.out.println(novoLivro.titulo+" adicionado!");
                    System.out.println("_________________________________________________________________________________");


                    break;

                case "2" :

                    System.out.println("Listar Livro");

                    if (livroList.size() > 0){
                        for (Livro porLivro: livroList){
                            System.out.println("_________________________________________________________________________________\n");
                            System.out.println("Nome do autor: "+porLivro.autor.nome);
                            System.out.println("\n"+"Data de Nascimento do autor: "+porLivro.autor.localNasc);
                            System.out.println("\n"+"Título: "+porLivro.titulo);
                            System.out.println("\n"+"Preço: R$"+porLivro.preco);
                            System.out.println("\n"+"Lançado: "+porLivro.dataLancamento);
                            System.out.println("_________________________________________________________________________________\n");


                        }}else {

                        System.out.println("nenhum livro registrado");

                    }

                    break;

                default :
                    System.out.println("valor invalido!!");

            }

        }while (!opcao.equals("0"));

    }
}