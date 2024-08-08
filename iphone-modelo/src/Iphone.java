public class Iphone implements AparelhoTelefonico, ReprodutorMusica, NavegadorInternet{
    public void tocar(){
        System.out.println("Tocando a música!");
    }

    public void pausar(){
        System.out.println("Música pausada!");
    }

    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: "+musica);
    }

    public void ligar(String numero){
        System.out.println("Ligando para o número: "+numero);
    }

    public void atender(){
        System.out.println("Atendendo a ligação!");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz!");
    }

    public void exibirPagina(String url){
        System.out.println("Navegando para: "+url);
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada!");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página!");
    }
}
