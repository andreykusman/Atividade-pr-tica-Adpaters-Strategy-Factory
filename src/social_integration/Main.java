package social_integration;

import social_integration.adapters.SocialMediaAdapter;
import social_integration.factory.SocialMediaFactory;
import social_integration.models.Conteudo;
import social_integration.models.Resposta;
import social_integration.strategy.*;

public class Main {
    public static void main(String[] args) {

        // --- Justificativa dos padrões ---
        // ✅ Adapter: uniformiza APIs diferentes (Twitter, Instagram, etc.) em uma interface comum.
        // ✅ Strategy: define diferentes estratégias de postagem (imagem, vídeo).
        // ✅ Factory: instancia dinamicamente o adapter correto com base na plataforma.

        Conteudo post1 = new Conteudo("Campanha de Marketing", "Nova coleção lançada!", "imagem");
        Conteudo post2 = new Conteudo("Making Of", "Bastidores da gravação!", "video");

        // Fábrica cria o adapter correto
        SocialMediaAdapter twitter = SocialMediaFactory.criarAdapter("twitter");
        SocialMediaAdapter instagram = SocialMediaFactory.criarAdapter("instagram");

        // Estratégias de postagem
        PostStrategy imageStrategy = new ImagePostStrategy();
        PostStrategy videoStrategy = new VideoPostStrategy();

        System.out.println("\n--- Publicação 1 ---");
        Resposta r1 = imageStrategy.postar(instagram, post1);
        System.out.println(r1);

        System.out.println("\n--- Publicação 2 ---");
        Resposta r2 = videoStrategy.postar(twitter, post2);
        System.out.println(r2);
    }
}
