package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete 
{

	private String codigo;
	private int tarifa;
	private boolean usado;

	public Tiquete(String codigo, Vuelo pVuleo, Cliente clienteComprador, int tarifa) {
		super();
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.usado = usado;
	}

	public String getCliente()
	{
		return null;
	}
	public String getVuelo()
	{
		return null;
	}
	public String getTCodigo()
	{
		return null;
	}
	public String getTarifa()
	{
		return null;
	}
	public void marcarComoUsado()
	{

	}
	public boolean esUsado()
	{
		return false;
	}

}
