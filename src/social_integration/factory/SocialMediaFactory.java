package social_integration.factory;

import social_integration.adapters.*;

public class SocialMediaFactory {
    public static SocialMediaAdapter criarAdapter(String plataforma) {
        switch (plataforma.toLowerCase()) {
            case "twitter": return new TwitterAdapter();
            case "instagram": return new InstagramAdapter();
            case "linkedin": return new LinkedInAdapter();
            case "tiktok": return new TikTokAdapter();
            default: throw new IllegalArgumentException("Plataforma desconhecida: " + plataforma);
        }
    }
}
