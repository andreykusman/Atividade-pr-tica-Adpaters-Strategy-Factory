package social_integration.adapters;

import social_integration.apis.TwitterAPI;
import social_integration.models.Conteudo;
import social_integration.models.Resposta;

public class TwitterAdapter implements SocialMediaAdapter {
    private TwitterAPI api = new TwitterAPI();

    @Override
    public Resposta postar(Conteudo conteudo) {
        api.postarTweet(conteudo.getMensagem());
        return new Resposta(true, "Publicado no Twitter");
    }
}
