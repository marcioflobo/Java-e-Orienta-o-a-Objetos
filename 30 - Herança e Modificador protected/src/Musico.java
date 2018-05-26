
public class Musico extends Pessoa{
    
    private Instrumento instrumento;

    public Musico() {
    }

    
    public Musico(String nome, int idade,Instrumento instrumento) {
        super.nome = nome;
        super.idade = idade;
        this.instrumento = instrumento;
    }

    public void apresentarMusico(){
        super.apresentarse();
        System.out.println("Minha especialidade é a/o "+this.getInstrumento().getDescricao());
    }
    
    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
    
    
}
