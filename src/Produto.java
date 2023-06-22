public class Produto {
    //Atribudos

    boolean diet;
    private String nome;
    double preco;

    //Metodo construtor padrão

    Produto(){}

    //Sobrecarga de metodo

    Produto(double _preco){
        this.preco = _preco;
    }

    public Produto(String _nome,double _preco){
        this.nome = _nome;
        tihs.preco = _preco;
    }

    //Setter

    public void setNome(String _nome){
        this.nome = _nome;
    }

}
