package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

public class Vuelo {

	private Ruta ruta;
	private String fecha;

	private Avion avion;

	public Ruta getRuta() {
		return ruta;
	}

	public String getFecha() {
		return fecha;
	}

	public Avion getAvion() {
		return avion;
	}

	public Collection<Tiquete> getTiquetes( )
	{
		// TODO implementar
		return null;
	}

	public int venderTiquetes( Cliente pCliente, CalculadoraTarifas pCalculadora, int pCantidad)
	{
		return 1;
	}

	public boolean equals(Object pObj)
	{
		return false;

	}

}
