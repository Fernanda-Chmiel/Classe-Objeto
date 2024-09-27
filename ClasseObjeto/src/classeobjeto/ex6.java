package classeobjeto;

public class ex6 {
    int contador = 0;
    int incrementa;
    int decrementa;

    public ex6(int incrementa, int decrementa) {
        this.incrementa = incrementa;
        this.decrementa = decrementa;
        contador = contador + incrementa - decrementa;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
