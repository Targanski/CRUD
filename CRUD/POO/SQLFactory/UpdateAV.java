public class UpdateAV {
    public static void main(String[] args){

        Produto produto1 = new Produto();

         produto1.id = 1;
        produto1.descricao = "H-60 BLACK HAWK";
        produto1.um = "28";
        produto1.preco = 475000;
        produto1.anoFabricacao = 1987;
        produto1.fornecedor = "Saab";

        
        boolean retorno = Database.atualizarRegistro(produto1);
        System.out.println(retorno);
}
}