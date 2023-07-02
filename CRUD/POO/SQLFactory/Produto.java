public class Produto extends SQLClass{            
    @Key
    int id;
    String descricao;
    double preco;    
    String um;
    int anoFabricacao;
    String fornecedor;
    

    Produto(){
        this.setTableName("aviao");        
    }    
}
