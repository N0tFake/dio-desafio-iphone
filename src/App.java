public class App {
    public static void main(String[] args) throws Exception {
        IPhone Iphone = new IPhone();
        String number = "5599981329923";
        String url = "http://google.com";
        Integer musicID = 3;

        Iphone.exibirPagina(url);
        Iphone.atualizarPagina();
        Iphone.adicionarNovaAba();
            
        Iphone.ligar(number);
        Iphone.atender();
        Iphone.iniciarCorreiosVoz(number);

        Iphone.selacionarMusica(musicID);
        Iphone.tocar();
        Iphone.pausar();
    }
}
