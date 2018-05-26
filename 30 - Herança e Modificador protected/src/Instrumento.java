
public enum Instrumento {
    
    GUITARRA("Guitarra"),
    BAIXO("Baixo"),
    BATERIA("Bateria"),
    TECLADO("Teclado");
    
private String descricao;

    private Instrumento() {
    }   
    
    private Instrumento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
     
    
}
