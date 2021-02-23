package Bchaises;

public abstract class VehiculePorte extends Vehicule{

    // attributs
    protected int nombre_portes;

    // constructeur
    public VehiculePorte(){
        super();
        this.nombre_portes = 0;
    }

    // constructeur paramétré
    public VehiculePorte(int s, boolean m, int v, int n){
        super(s, m, v);
        this.nombre_portes = n;
    }

    //accesseur
    // getter
    public int getNombre_portes() { return this.nombre_portes; }

    //setter
    public void setNombre_portes(int n) { this.nombre_portes = n; }

    //methode
}
