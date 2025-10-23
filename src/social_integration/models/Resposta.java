package social_integration.models;

public class Resposta {
    private boolean sucesso;
    private String mensagem;

    public Resposta(boolean sucesso, String mensagem) {
        this.sucesso = sucesso;
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return (sucesso ? "[SUCESSO] " : "[ERRO] ") + mensagem;
    }
}
