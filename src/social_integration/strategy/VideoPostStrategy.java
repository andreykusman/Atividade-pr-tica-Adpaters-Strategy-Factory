package social_integration.strategy;

import social_integration.adapters.SocialMediaAdapter;
import social_integration.models.Conteudo;
import social_integration.models.Resposta;

public class VideoPostStrategy implements PostStrategy {
    @Override
    public Resposta postar(SocialMediaAdapter adapter, Conteudo conteudo) {
        System.out.println("🎬 Usando estratégia de postagem de vídeo...");
        return adapter.postar(conteudo);
    }
}
