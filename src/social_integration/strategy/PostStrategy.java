package social_integration.strategy;

import social_integration.models.Conteudo;
import social_integration.models.Resposta;
import social_integration.adapters.SocialMediaAdapter;

public interface PostStrategy {
    Resposta postar(SocialMediaAdapter adapter, Conteudo conteudo);
}
