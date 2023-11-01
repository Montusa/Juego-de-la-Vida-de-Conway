public class Tablero {
    private int tamanio;
    private Celula[][] mundo = new Celula[tamanio][tamanio];

    Tablero(int tamanio){
        this.tamanio = tamanio;
    }

    public void imprimir(){

    }

    public Celula[][] getMundo() {
        return mundo;
    }

    public int cantVecinos(Celula cell){
        return cell.getVecinos();
    }

    public void crearMundo(int cant){
        for(int i=0; i<=tamanio; i++){
            for(int j=0; j<=tamanio; j++){
                int[] pos = new int[2];
                pos[0] = i;
                pos[1] = j;
                Celula cell = new Celula(pos);
                mundo[i][j] = cell;
            }
        }
    }
}
