package Bchaises;

public class CamionBenne extends Vehicule{

    // attributs
    private int nombre_portes;
    private int contenance_benne;
    private boolean pin_bloque;

    // constructeur
    public CamionBenne() {
        super();
        this.nombre_portes = 0;
        this.contenance_benne = 0;
        this.pin_bloque = true;
    }

    // constructeur paramétré
    public CamionBenne(int i, boolean m, int v, int n, int c, boolean p ) {
        super(i, m, v);
        this.nombre_portes = n;
        this.contenance_benne = c;
        this.pin_bloque = p;
    }

    // accesseur
    // getter
    public int getNombre_portes() { return this.nombre_portes; }
    public  int getContenance_benne() { return this.contenance_benne; }
    public boolean getPin_bloque() { return this.pin_bloque; }

    // setter
    public void setNombre_portes(int n) { this.nombre_portes = n; }
    public void setContenance_benne(int c) { this.contenance_benne = c; }
    public void setPin_bloque(boolean p) { this.pin_bloque = p; }

    // méthodes
    public void debloquerCode( int code) {
        if ( code == 1234){
            pin_bloque = false;
        }
        else{
            pin_bloque = true;
        }
    }
}
