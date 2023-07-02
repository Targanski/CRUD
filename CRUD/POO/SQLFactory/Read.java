public class Read{
    public static void main(String[] args){

        Produto produto1 = new Produto();

        boolean retorno = Database.abrirID(produto1, 1);
        System.out.println("//////CRUD////////");
        System.out.println(produto1.descricao + " " + produto1.preco);
        System.out.println("///////CRUD///////");

    }
}