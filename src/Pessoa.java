public class Pessoa {

    //Atributo  da pessoa

    public String  nome;
    public String  sobrenome;

    //Metodos da pessoa

    public void falar(){
        System.out.println("falei");
    }

    //sobrecarga do metodo falar()

    public String falar(String volume){
        return "falei" + volume;
    }
}
