public class Rezervor {
    private final int capacitateMaxima;
    private float cantitateCombustibil;
    private float nivelUmplere;

    Rezervor(int capacitateMaxima, float cantitateCombustibil, float nivelUmplere) {
        this.capacitateMaxima = capacitateMaxima;
        this.cantitateCombustibil = cantitateCombustibil;
        this.nivelUmplere = nivelUmplere;
    }

    public int getCapacitateMaxima() {
        return this.capacitateMaxima;
    }

    public float getCantitateCombustibil() {
        return this.cantitateCombustibil;
    }
    public float getNivelUmplere() {
        return this.nivelUmplere;
    }
    public void umplere(float cantitate) {
        if ((this.cantitateCombustibil < this.capacitateMaxima) && (this.cantitateCombustibil + cantitate < this.capacitateMaxima)) {
            this.cantitateCombustibil += cantitate;
        }
        else {
            this.cantitateCombustibil += (this.capacitateMaxima - this.cantitateCombustibil);
        }
        this.nivelUmplere = cantitateCombustibil / capacitateMaxima;
    }

    public void golire(float cantitate) {
        if (this.cantitateCombustibil - cantitate >= 0) {
            this.cantitateCombustibil -= cantitate;
            this.nivelUmplere = cantitateCombustibil / capacitateMaxima;
        } else {
            this.cantitateCombustibil = 0;
            this.nivelUmplere = 0;
        }
    }
}
