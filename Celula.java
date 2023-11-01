public class Celula{
    private boolean estado;
    private int[] posicion;
    private int vecinos;

    Celula(int[] posicion){
        this.posicion = posicion;
    }

    public void nacer(){
        estado = true;
    }

    public void morir(){
        estado = false;
    }

    public boolean getEstado(){
        return estado;
    }

    public int getVecinos() {
        return vecinos;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setVecinos(int vecinos) {
        this.vecinos = vecinos;
    }
}
