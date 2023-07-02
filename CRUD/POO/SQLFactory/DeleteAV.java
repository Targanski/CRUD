public class DeleteAV{
    public static void main(String[] args){

        Produto produto1 = new Produto();

        produto1.id = 13;
        
        boolean retorno = Database.deletarRegistro(produto1);
        System.out.println(retorno);

       
    }
}