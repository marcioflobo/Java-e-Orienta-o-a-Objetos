
public class Pessoa {
   public String nome;
   private int idade;
  
   
   public void setIdade(int idade){
       this.idade=idade;
   }
   public int getIdade(){
       return this.idade;
   }
   
   
   public void apresentarse(){
       System.out.println("Meu nome é "+nome+", tenho "+getIdade()+" anos");
   }
}
