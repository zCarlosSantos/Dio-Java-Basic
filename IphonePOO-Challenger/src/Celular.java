public class Celular implements Navegador, AppSmartPhone, MusicPlayer{

    @Override
    public void ligar() {

    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void selecionarMusica() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void atualizarPagina() {

    }

    public static void main(String[] args) {
            Celular celular = new Celular();

            celular.ligar();
            celular.atender();
            celular.iniciarCorreioVoz();
            System.out.println("");

            celular.adicionarNovaAba();
            celular.exibirPagina();
            celular.atualizarPagina();
            System.out.println("");

            celular.selecionarMusica();
            celular.play();
            celular.pausar();

        }

}
