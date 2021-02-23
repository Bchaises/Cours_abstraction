package Bchaises;

public class Moto extends Vehicule{

    // attriibuts
    private boolean bequille_enclenche;

    // constructeur
    public Moto(){
        super();
        this.bequille_enclenche = false;
    }

    // constructeur paramétré
    public Moto( int s, boolean m, int v, boolean b){
        super(s, m, v);
        this.bequille_enclenche = b;
    }

    // accesseur
    // getter
    public boolean getBequille_enclenche(){ return this.bequille_enclenche; }

    // setter
    public void setBequille_enclenche(boolean b) { this.bequille_enclenche = b; }

    // méthodes
    public void altererBequille(){
        this.bequille_enclenche = false;
    }
}
