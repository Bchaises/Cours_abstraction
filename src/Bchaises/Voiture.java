package Bchaises;

public class Voiture extends VehiculePorte{

    // attributs
    private int nombre_portes;

    // constructeur
    public Voiture(){
        super();
    }

    // constructeur pramétré
    public Voiture(int s, boolean m, int v, int n){
        super(s,m,v,n);
    }

    // accesseur
    // getter

    // setter

    // méthodes
    @Override
    public void demarrer(){
        System.out.println("Démarrage voiture");
        this.moteur_allume = true;
    }

    @Override
    public void accelerer(){
        this.vitesse++;
    }
}
