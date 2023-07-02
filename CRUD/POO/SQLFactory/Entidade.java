public class Entidade extends SQLClass{
    
    Entidade(){
        this.setTableName("ENTIDADES");                
    }
    
    String nome;
    String fone;
    String documento;
    int idade;
}
