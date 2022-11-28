public class Matrice {
    private final int rows;
    private final int columns;
    Complex [][] matriceComplex;
    Matrice(int rows, int columns, Complex [][] matriceComplex){
        this.rows = rows;
        this.columns = columns;
        this.matriceComplex = matriceComplex;
    }
    void adunare(Complex [][] m) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matriceComplex[i][j].adunare(m[i][j]);
            }
        }
    }
    public String toString() {
        StringBuilder rez = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rez.append(matriceComplex[i][j]).append(" ");
            }
            rez.append("\n");
        }
        return rez.toString();
    }
}
