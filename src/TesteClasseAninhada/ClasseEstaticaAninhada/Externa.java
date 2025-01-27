package TesteClasseAninhada.ClasseEstaticaAninhada;

//CLASSE ESTÁTICA ANINHADA
public class Externa {
    static class EstaticaAninhada{
        void exibirMensagem(){
            System.out.println("msg da classe estática aninhada");
        }

        static void exibirSegundaMensagem(){
            System.out.println("Segunda mensagem");
        }
    }
    public static void main (String[] args){

        //chamando metodo estatico sem instanciar a classe
        EstaticaAninhada.exibirSegundaMensagem();

        //Instanciando a classe estática para chamar o metodo nao estático (não precisa instanciar a classe Externa)
        //Externa.EstaticaAninhada estaticaAninhada = new Externa.EstaticaAninhada();
        //estaticaAninhada.exibirMensagem();
    }
}
