public class Main {
    public static void main(String[] args) {



        //Aula introdutoria de orientação à objetos


        Pessoa adao = new Pessoa();

        //Declaração de objeto

        Pessoa qualquer;

        //Instaciação de objeto

        qualquer = new Pessoa();

        //definição do formato da pessoa qualquer

        qualquer.nome = "Rock";
        qualquer.sobrenome = "Lee";
        qualquer.falar();

        Pessoa rainha;

        //Instanciar objetos

        rainha = new Pessoa();

        //definir forma do objeto

        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";

        //Definir comportamento  do objeto

        rainha.falar();
        System.out.println(rainha.falar("Auto "));

        rainha.comer();

        Produto p1 = new Produto(5.00);
        Produto p2 = new Produto();
        Produto p3;

        p3 = new Produto("Bala", 1.00);
        p3 = new Produto("chiclete",0.50);

        p1.preco = 10.0;
        //p1.nome = "chocolate";
        p1.setNome("chocolate");

    }
}