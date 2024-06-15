import funcoes.*;

public class iPhoneFuncoes{
    public static void main(String[] args){
        aparelhoTelefonico aparelhoTelefonico = new aparelhoTelefonico();
        aparelhoTelefonico.ligacao();
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.atenderLigacao();

        reprodutorMusical reprodutorMusical = new reprodutorMusical();
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();
        reprodutorMusical.selecionarMusica();

        navegadorInternet navegadorInternet = new navegadorInternet();
        navegadorInternet.exibirPagina();
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();

    }
}