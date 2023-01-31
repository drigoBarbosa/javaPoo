
package aula02;

public class Aula02 {

    public static void main(String[] args) {
       System.out.println("");
       System.out.println("Caneta 1: ");
       System.out.println("");
       Caneta c1 = new Caneta(); // Estanciando um objeto c1 da classe Caneta
       c1.modelo = "Bic Cristal";
       c1.cor = "Azul";
       // c1.ponta = 0.5f ;
       c1.carga();
       c1.status();
    }
    
}
