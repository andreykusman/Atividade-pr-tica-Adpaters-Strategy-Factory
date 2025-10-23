# 🧩 Atividade Prática — Adapters + Strategy + Factory  
## Sistema de Integração de APIs de Mídia Social  

---

### 📘 **Objetivo**
Desenvolver um sistema unificado de gerenciamento de redes sociais utilizando os padrões **Adapter**, **Strategy** e **Factory**.  
O sistema permite publicar conteúdo em diferentes plataformas (Twitter, Instagram, LinkedIn, TikTok) por meio de uma interface unificada, com estratégias de postagem configuráveis e criação dinâmica de conexões.

---

### 🏗️ **Arquitetura do Projeto**

src/
└── social_integration/
├── adapters/ → Implementações dos Adapters (InstagramAdapter, TwitterAdapter, etc.)
├── apis/ → Simulações das APIs de cada rede social
├── factory/ → SocialMediaFactory: cria adapters dinamicamente
├── strategy/ → Estratégias de postagem (imagem, vídeo, texto)
├── models/ → Classes de domínio (Conteudo, Publicacao, Resposta, Estatisticas)
└── Main.java → Classe principal de execução



💻 Execução no Terminal
🏗️ Compilação

javac -encoding UTF-8 -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })

▶️ Execução

java -cp out social_integration.Main




Diagrama de Classes (Simplificado)

+----------------------+
|     Conteudo         |
+----------------------+
| tipo: String         |
| mensagem: String     |
+----------------------+

+----------------------+
| MidiaSocialAdapter   |<-----------------+
+----------------------+                  |
| publicarConteudo()   |                  |
+----------------------+                  |
         ^                                |
         |                                |
+----------------------+    +----------------------+
| InstagramAdapter     |    | TwitterAdapter       |
+----------------------+    +----------------------+
| api: InstagramAPI    |    | api: TwitterAPI      |
+----------------------+    +----------------------+

+----------------------+
| SocialMediaFactory   |
+----------------------+
| criarAdapter(tipo)   |
+----------------------+

+----------------------+
| EstrategiaPostagem   |<----------------+
+----------------------+                 |
| postar(adapter, c)   |                 |
+----------------------+                 |
         ^                               |
         |                               |
+----------------------+    +----------------------+
| PostagemImagem       |    | PostagemVideo        |
+----------------------+    +----------------------+

+----------------------+
| GerenciadorMidiaSocial |
+----------------------+
| estrategia: EstrategiaPostagem |
| publicar(conteudo)            |
+----------------------+
