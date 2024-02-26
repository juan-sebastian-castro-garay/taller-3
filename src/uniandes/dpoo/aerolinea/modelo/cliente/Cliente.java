package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente 
{

	public Cliente() 
	{
	}
	
	public String getTipoliente()
	{
		return null;
	}

	public String getIdentificador()
	{
		return null;
	}

	public Void agregarTiquete(Tiquete pTiquete)
	{
		return null;
	}
	
	public int calcularValorTotalTiquetes()
	{
		return 0;
	}
	
	public void usarTiquetes(Vuelo pVuelo)
	{
	}
	
}
