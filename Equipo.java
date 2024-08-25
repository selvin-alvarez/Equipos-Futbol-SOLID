package equipoFutbolSolid;

import java.util.ArrayList;
import java.util.List;

class Equipo {
	
	private List<Jugador> jugadores;
    private Entrenador entrenador;

    public Equipo(Entrenador entrenador) {
        this.jugadores = new ArrayList<>();
        this.entrenador = entrenador;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void removerJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }
}


