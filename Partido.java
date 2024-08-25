package equipoFutbolSolid;

import java.util.Random;

import java.util.Date;

class Partido implements IPartido {
	
	private Date fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(Date fecha, Equipo equipoLocal, Equipo equipoVisitante) {
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	
	@Override
    public void jugarPartido() {
		Random random = new Random();
        int golesLocal = 0;
        int golesVisitante = 0;

        // Goles para el equipo local
        for (Jugador jugador : equipoLocal.getJugadores()) {
            if (random.nextBoolean()) {
                int goles = random.nextInt(4); // Cada jugador puede marcar de 0 a 3 goles
                golesLocal += goles;
                System.out.println(jugador.getNombre() + " (Barcelona) marcó " + goles + " goles.");
            }
        }

        // Goles para el equipo visitante
        for (Jugador jugador : equipoVisitante.getJugadores()) {
            if (random.nextBoolean()) {
                int goles = random.nextInt(4); // Cada jugador puede marcar de 0 a 3 goles
                golesVisitante += goles;
                System.out.println(jugador.getNombre() + " (Real Madrid) marcó " + goles + " goles.");
            }
        }

        // Mostrar el resultado del partido
        System.out.println("Resultado del partido:");
        System.out.println(equipoLocal.getEntrenador().getNombre() + " (Barcelona) " + golesLocal + " - " + golesVisitante + " " + equipoVisitante.getEntrenador().getNombre() + " (Real Madrid)");
    }
}
