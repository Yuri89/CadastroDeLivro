package example.classes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Livro{
    public String titulo;
    public Autor autor;
    public Autor dataNascimento;
    public float preco;
    public LocalDate dataLancamento;


    ArrayList<Livro> livroList = new ArrayList<Livro>();
    Scanner leitor = new Scanner(System.in);

    public void CadastrarLivro(Livro livro ){


        Livro novoLivro = new Livro();
        Autor novoAutor = new Autor();
        System.out.println("Cadastrar Livro\n");
        System.out.println("_________________________________________________________________________________");


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



//        if (lancamento.getYears() <= 5){
            System.out.println(" "+novoLivro.dataLancamento+" Aprovado");



            novoLivro.autor = novoAutor;
            novoLivro.dataNascimento = novoAutor;


            livroList.add(novoLivro);
            System.out.println("_________________________________________________________________________________");
            System.out.println(novoLivro.titulo+" adicionado!");
            System.out.println("_________________________________________________________________________________");
//        }else {
//            System.out.println(" Não pode ter menos de 5 anos");
//        }

    }

    public List<Livro> listarLivros(){

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


        return null;
    }

    public List<Livro> VerificarTempoLanc(){

        if (livroList.size() > 0){
            for (Livro porLivro: livroList){

                System.out.println("_________________________________________________________________________________\n");
                System.out.println("Nome do autor: "+porLivro.autor.nome);

                if (porLivro.dataLancamento.getYear() <= 5){
                System.out.println("\n"+"Livro "+porLivro.titulo+" Aprovado!!");
                }else {System.out.println("\n"+"Livro "+porLivro.titulo+" não aprovado,não pode ter mais que 5 anos!");}
                System.out.println("_________________________________________________________________________________\n");

            }}else {

            System.out.println("nenhum livro registrado");

        }


        return null;
    }
}
