package Aquecimento2;

public class Principal { 
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem("Joberson", 200);

        personagem1.receberDano(100);
        personagem1.exibirStatus();
        
        System.out.println("-------------------------");

        personagem1.curar(300);
        personagem1.exibirStatus();
    
        System.out.println("-------------------------");
    
    }
}
