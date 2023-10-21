package Interfaces;

import org.w3c.dom.html.HTMLElement;

public interface Browser {
  public String exibirPagina(String url);
  public void adicionarNovaAba();
  public void atualizarPagina();
}
