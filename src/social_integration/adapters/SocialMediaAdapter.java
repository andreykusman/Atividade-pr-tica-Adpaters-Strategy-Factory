package social_integration.adapters;

import social_integration.models.Conteudo;
import social_integration.models.Resposta;

public interface SocialMediaAdapter {
    Resposta postar(Conteudo conteudo);
}
