package social_integration.adapters;

import social_integration.apis.InstagramAPI;
import social_integration.models.Conteudo;
import social_integration.models.Resposta;

public class InstagramAdapter implements SocialMediaAdapter {
    private InstagramAPI api = new InstagramAPI();

    @Override
    public Resposta postar(Conteudo conteudo) {
        api.publicarImagem(conteudo.getMensagem());
        return new Resposta(true, "Publicado no Instagram");
    }
}
