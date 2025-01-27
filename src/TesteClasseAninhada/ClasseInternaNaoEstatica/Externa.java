package TesteClasseAninhada.ClasseInternaNaoEstatica;

//CLASSE INTERNA NAO ESTATICA
public class Externa {
    private String mensagem = "Mensagem privada da classe externa";

    class Interna {
        void exibirMensagem(){
            System.out.println(mensagem);
        }
    }

    public static void main(String [] args){
       // criando uma instancia da classe interna apartir da classe externa
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();

        interna.exibirMensagem();

    }
}
