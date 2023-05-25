public class Pessoa extends Animal {

    //Atributo  da pessoa
    public String sobrenome;

    //Metodos da pessoa

    public void falar(){
        System.out.println("falei");
    }

    //sobrecarga do metodo falar()

    public String falar(String volume){
        return "falei" + volume;
    }
    //sobreescrita do metodo
    public void comer(){
        System.out.println("comeu como uma pessoa");
    }
}
