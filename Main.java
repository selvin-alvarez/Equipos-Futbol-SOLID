package equipoFutbolSolid;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		// Jugadores para el equipo local
        Jugador jugador1 = new Jugador("Lionel Messi", 25, "Delantero", 10);
        Jugador jugador2 = new Jugador("Andres Iniesta", 28, "Mediocampista", 8);
        Jugador jugador3 = new Jugador("Carles Puyol", 22, "Defensa", 5);

        // Jugadores para el equipo visitante
        Jugador jugador4 = new Jugador("Cristiano Ronaldo", 27, "Delantero", 7);
        Jugador jugador5 = new Jugador("Tony Kross", 30, "Mediocampista", 8);
        Jugador jugador6 = new Jugador("Sergio Ramos", 24, "Defensa", 4);

        // Eentrenadores
        Entrenador entrenadorLocal = new Entrenador("Josep Guardiola", 45, "Ofensiva");
        Entrenador entrenadorVisitante = new Entrenador("Jose Mourinho", 50, "Defensiva");

        // Equipos
        Equipo equipoLocal = new Equipo(entrenadorLocal);
        equipoLocal.agregarJugador(jugador1);
        equipoLocal.agregarJugador(jugador2);
        equipoLocal.agregarJugador(jugador3);

        Equipo equipoVisitante = new Equipo(entrenadorVisitante);
        equipoVisitante.agregarJugador(jugador4);
        equipoVisitante.agregarJugador(jugador5);
        equipoVisitante.agregarJugador(jugador6);

        // Crear y jugar el partido
        Partido partido = new Partido(new Date(), equipoLocal, equipoVisitante);
        partido.jugarPartido();
    }
}


