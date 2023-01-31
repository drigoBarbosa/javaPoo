package aula04;
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    public Caneta(String m, String c, float p) { // Esse é o método construtor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        tampar();
        
        // this.tampar();
        // this.cor = "Azul";
        // this.modelo = "compactor";
        // this.ponta = 0.5f;
        
        
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    public void status() {
        // System.out.println("Sobre a Caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("cor : " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
