public class SQLFactory{
    public static void main(String[] args){

        Produto produto1 = new Produto();

        produto1.id = 13;
        produto1.descricao = "H-60 BLACK HAWK";
        produto1.um = "28";
        produto1.preco = 475000;
        produto1.anoFabricacao = 55;
        produto1.fornecedor = "brazil";
        

        boolean retorno = Database.inserirRegistro(produto1);
        System.out.println(retorno);

      
    
    }
}