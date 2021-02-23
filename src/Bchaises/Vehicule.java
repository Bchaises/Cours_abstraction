package Bchaises;

public abstract class Vehicule {

    // attributs
    protected int num_serie;
    protected boolean moteur_allume;
    protected int vitesse;
    private static int COMPTEUR = 0;

    // constructeur
    public Vehicule() {
        this.num_serie = 0;
        this.moteur_allume = false;
        this.vitesse = 0;
    }

    // constructeur paramétré
    public Vehicule(int s, boolean m, int v){
        this.num_serie = s;
        this.moteur_allume = m;
        this.vitesse = v;
        COMPTEUR++;
    }

    // accesseur
    //getter
    public int getNum_serie() { return this.num_serie; }
    public boolean getMoteur_allume() { return this.moteur_allume; }
    public int getVitesse() { return this.vitesse; }

    //setter
    public void setNum_serie(int i) { this.num_serie = i; }
    public void setMoteur_allume(boolean m) { this.moteur_allume = m; }

    // méthodes
    public abstract void demarrer();

    public abstract void accelerer();

    @Override
    public String toString(){
        String res = "Un super vehicule";
        return res;
    }

}
