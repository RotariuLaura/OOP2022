public class Matrice {
    private final NrComplex[][] matrice;
    private final int rows;
    private final int columns;

    public Matrice(int rows, int columns, NrComplex[][] mat) {
        this.rows = rows;
        this.columns = columns;
        this.matrice = mat;
    }

    public String toString() {
        String rez = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rez = rez + this.matrice[i][j];
            }
            rez = rez + "\n";
        }
        return rez;
    }

    public void adunare(Matrice m) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrice[i][j].adunare(m.matrice[i][j]);
            }
        }
    }

    public void scadere(Matrice m) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrice[i][j].scadere(m.matrice[i][j]);
            }
        }
    }

    public void inmultireScalar(int nr) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrice[i][j].inmultireScalar(nr);
            }
        }
    }

    public void inmultireMatrice(Matrice m) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                NrComplex sum = new NrComplex(0, 0);
                for (int k = 0; k < columns; k++) {
                    this.matrice[i][k].inmultireComplex(m.matrice[k][j]);
                    sum.adunare(sum);
                    sum.adunare(this.matrice[i][k]);
                }
                this.matrice[i][j].setReal(0);
                this.matrice[i][j].setImaginar(0);
                this.matrice[i][j].adunare(sum);
            }
        }
    }
}
