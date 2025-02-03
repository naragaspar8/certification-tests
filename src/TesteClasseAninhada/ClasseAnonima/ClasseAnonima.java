package TesteClasseAninhada.ClasseAnonima;

public class ClasseAnonima {
    interface Saudacao {
        default void dizerOla(String nome) {

        }

        public static void main (String[] args){

            Saudacao saudacao = new Saudacao() {
                @Override
                public void dizerOla(String nome) {
                    System.out.println("Olá, " + nome + "!" );
                }
            };

            saudacao.dizerOla("joao");
        }
    }

}
