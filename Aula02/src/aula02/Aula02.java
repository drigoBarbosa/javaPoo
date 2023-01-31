
package aula02;

public class Aula02 {

    public static void main(String[] args) {
       System.out.println("");
       System.out.println("Caneta 1: ");
       System.out.println("");
       Caneta c1 = new Caneta(); // Estanciando um objeto c1 da classe Caneta
       c1.modelo = "Bic"; // Atribuindo valores aos atributos de c1
       c1.cor = "azul";
       c1.ponta = 0.5f;
       c1.tampar(); // Chamando Metódos de c1
       c1.status();
       
       // c1.destampar();
       c1.rabiscar();
       System.out.println("");
       System.out.println("Caneta 2: ");
       System.out.println("");
       Caneta c2 = new Caneta(); // Estanciando um objeto c2 da mesma classe Caneta
       c2.modelo = "Compactor"; // Atribuindo valores aos atributos de c2
       c2.cor = "Vermelho";
       c2.ponta = 0.5f;
       c2.status();  // Chamando Metódos de c2
       c2.rabiscar();
    }
    
}
