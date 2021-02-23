package Bchaises;

public class CamionBenne extends VehiculePorte{

    // attributs
    private int contenance_benne;
    private boolean pin_bloque;

    // constructeur
    public CamionBenne() {
        super();
        this.contenance_benne = 0;
        this.pin_bloque = true;
    }

    // constructeur paramétré
    public CamionBenne(int s, boolean m, int v, int n, int c, boolean p ) {
        super(s, m, v, n);
        this.contenance_benne = c;
        this.pin_bloque = p;
    }

    // accesseur
    // getter
    public  int getContenance_benne() { return this.contenance_benne; }
    public boolean getPin_bloque() { return this.pin_bloque; }

    // setter
    public void setContenance_benne(int c) { this.contenance_benne = c; }
    public void setPin_bloque(boolean p) { this.pin_bloque = p; }

    // méthodes
    public void debloquerPin() {
        this.pin_bloque = false;
    }

    @Override
    public void demarrer(){
        System.out.println("Démarrage camion");
        this.debloquerPin();
        this.moteur_allume = true;
    }

    @Override
    public void accelerer(){
        this.vitesse++;
    }
}
