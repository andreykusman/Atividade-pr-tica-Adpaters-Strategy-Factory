package social_integration.adapters;

import social_integration.apis.TikTokAPI;
import social_integration.models.Conteudo;
import social_integration.models.Resposta;

public class TikTokAdapter implements SocialMediaAdapter {
    private TikTokAPI api = new TikTokAPI();

    @Override
    public Resposta postar(Conteudo conteudo) {
        api.enviarVideo(conteudo.getMensagem());
        return new Resposta(true, "Publicado no TikTok");
    }
}
