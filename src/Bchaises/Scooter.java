package Bchaises;

public class Scooter extends Moto{

    // attributs
    private int vitesse_max;

    // constructeur
    public Scooter (){
        super();
        this.vitesse_max = 50;
    }

    // constructeur paramétré
    public Scooter(int s, boolean m, int v, boolean b,int vm){
        super(s, m, v, b);
        this.vitesse_max = vm;
    }

    // accesseur
    //getter
    public int getVitesse_max() { return this.vitesse_max; }

    // setter
    public void setVitesse_max(int vm) { this.vitesse_max = vm; }

    // méthodes
    public void demarrer(){
        System.out.println("Démarrage scooter");
        this.moteur_allume = true;
    }
}
