import org.w3c.dom.html.HTMLElement;

import Interfaces.Browser;
import Interfaces.MusicPlayer;
import Interfaces.Telephone;

public class IPhone implements MusicPlayer, Telephone, Browser{

  @Override
  public String exibirPagina(String url) {
    return "<h1>" + url + "</h1>";
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Pagina adicionada");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Pagina atualizada");
  }

  @Override
  public void ligar(String number){
    System.out.println("Chamando o numero " + number);
  }

  @Override
  public void atender() {
    System.out.println("Ligação iniciada");
  }

  @Override
  public void iniciarCorreiosVoz(String number) {
    System.out.println("Encaminhada para o correios de voz");
  }

  @Override
  public boolean tocar() {
    System.out.println("Tocando musica");
    return true;
  }

  @Override
  public boolean pausar() {
    System.out.println("Musica pausada");
    return false;
  }

  @Override
  public String selacionarMusica(Integer musicID) {
    String [] musics = {"Music", "Music2", "Music3", "Music4", "Music5", "Music6"};
    return musics[musicID];
  }
}
