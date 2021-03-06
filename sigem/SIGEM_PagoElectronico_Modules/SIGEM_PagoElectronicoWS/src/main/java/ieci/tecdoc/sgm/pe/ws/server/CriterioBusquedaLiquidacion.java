package ieci.tecdoc.sgm.pe.ws.server;
/*
 * $Id: CriterioBusquedaLiquidacion.java,v 1.1.4.1 2008/01/25 12:30:46 jconca Exp $
 */
public class CriterioBusquedaLiquidacion {

	private String referencia;
	private String idEntidadEmisora;
	private String idTasa;
	private String ejercicio;
	private String nif;
	private String nrc;
	private String estado;
	
	public String getEjercicio() {
		return ejercicio;
	}
	public void setEjercicio(String ejercicio) {
		this.ejercicio = ejercicio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getIdEntidadEmisora() {
		return idEntidadEmisora;
	}
	public void setIdEntidadEmisora(String idEntidadEmisora) {
		this.idEntidadEmisora = idEntidadEmisora;
	}
	public String getIdTasa() {
		return idTasa;
	}
	public void setIdTasa(String idTasa) {
		this.idTasa = idTasa;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		this.nrc = nrc;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	
}
