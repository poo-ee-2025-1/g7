public class Usuario {
    private String nome;
    private String cargo;
    private int id;
    private String email;
    private String senha;

    public Usuario(String nome, String cargo, int id, String email, String senha) {
        this.nome = nome;
        this.cargo = cargo;
        this.id = id;
        this.email = email;
        this.senha = senha;
    }

    public boolean autenticar(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public void receberAlerta(Alerta alerta) {
        System.out.println("\n--- Alerta recebido por " + nome + " ---");
        System.out.println(alerta.getMensagem());
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getId() {
        return id;
    }
}
