package social_integration.models;

public class Conteudo {
    private String titulo;
    private String mensagem;
    private String tipo; // "imagem", "video", "texto"

    public Conteudo(String titulo, String mensagem, String tipo) {
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public String getTitulo() { return titulo; }
    public String getMensagem() { return mensagem; }
    public String getTipo() { return tipo; }
}
