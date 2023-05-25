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

    }
}