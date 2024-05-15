package br.com.alura.minhasmusicas.princiapal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");
        
        
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproducao();
        }
        
        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }
        
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("NerdCast");
        meuPodcast.setApresentador("Apresentadores são ....");
        
        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproducao();
        }
        
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }
        
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
