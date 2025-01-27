package TesteClasseAninhada.ClasseLocal;

// CRIANDO UMA CLASSE LOCAL
public class Calculadora {

    public static void main(String [] args){

        int num1 = 5;
        int num2 = 10;

        class Soma {
            void somaNumeros(){
              int somando = num1 + num2;
              System.out.println("a soma é = " + somando);

            }
        }

        //instancia a classe local diretamente na classe main
        Soma soma = new Soma();
        soma.somaNumeros();
    }
}
