
public class Usuario {

    private String nome;
    private Status status;

    public Usuario(String nome, Status status) {
        this.nome = nome;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public Status getStatus() {
        return status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
