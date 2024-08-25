package equipoFutbolSolid;

class Jugador extends Persona {

	private String posicion;
    private int numero;

    public Jugador(String nombre, int edad, String posicion, int numero) {
        super(nombre, edad);
        this.posicion = posicion;
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumero() {
        return numero;
    }
    
    public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}


