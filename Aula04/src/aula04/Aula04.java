package aula04;

public class Aula04 {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Compactor", "Verde", 1.5f);
        c1.destampar();
        c1.status();
        // c1.setModelo("BIC");  // Se o atributo for privado só consigo fazer modiicações com o método modificador set.
        // c1.modelo = "BIC";  Dessa forma só funciona se o Atributo for público.
        
        // c1.setPonta(0.5f);
        // c1.ponta = 0.5f; 
        
        /**  
          System.out.println("Tenho uma caneta " + c1.getModelo() + " com ponta " + c1.getPonta()); 
          Também não consigo acessar o atributo privado sem o método de acesso get.
          System.out.println(" Caneta 1: " + c1);
          c1.status(); 
          */
        
        System.out.println(" ");
        System.out.println(" ====================================================");
        System.out.println(" ");
        
        Caneta c2 = new Caneta("Faber-Castel", "Preta", 0.5f);
        c2.status();
        /**  
        c2.setModelo("BIC");
        c2.setPonta(1.0f);
        c2.destampar();
        c2.setCor("Vermelha");
        System.out.println(" Caneta 2: ");
        c2.status(); 
        */
    }
    
}
