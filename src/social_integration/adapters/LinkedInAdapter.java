package social_integration.adapters;

import social_integration.apis.LinkedInAPI;
import social_integration.models.Conteudo;
import social_integration.models.Resposta;

public class LinkedInAdapter implements SocialMediaAdapter {
    private LinkedInAPI api = new LinkedInAPI();

    @Override
    public Resposta postar(Conteudo conteudo) {
        api.criarPost(conteudo.getMensagem());
        return new Resposta(true, "Publicado no LinkedIn");
    }
}
