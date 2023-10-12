package example;

import example.classes.Autor;
import example.classes.Livro;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Livro metodoLivro = new Livro();


        Scanner leitor = new Scanner(System.in);
        String opcao;

        System.out.println("Bem Vindo ao Sistema");

        do {

            System.out.println("\n cadastrar - 1 | listar - 2 | verificar - 3 |Sair - 0");
            opcao = leitor.next();
            switch (opcao){
                case "1" :
                    metodoLivro.CadastrarLivro(metodoLivro);
                    break;

                case "2" :

                    metodoLivro.listarLivros();

                    break;

                case "3" :

                    metodoLivro.VerificarTempoLanc();

                    break;


                default :
                    System.out.println("valor invalido!!");

            }

        }while (!opcao.equals("0"));

    }
}