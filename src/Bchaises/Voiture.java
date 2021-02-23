package Bchaises;

public class Voiture extends Vehicule{

    // attributs
    private int nombre_portes;

    // constructeur
    public Voiture(){
        super();
        this.nombre_portes = 0;
    }

    // constructeur pramétré
    public Voiture(int i, boolean m, int v, int n){
        super(i,m,v);
        this.nombre_portes = n;
    }

    // accesseur
    // getter
    public int getNombre_portes(){ return this.nombre_portes; }

    // setter
    public void setNombre_portes(int n) { this.nombre_portes = n; }

    // méthodes

}
