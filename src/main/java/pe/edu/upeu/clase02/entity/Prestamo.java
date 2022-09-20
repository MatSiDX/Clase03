package pe.edu.upeu.clase02.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idprestamo;
	private String fecha_prestamo;
	private String fecha_devolución;
	private int idempleado;
	private int idalumno;
	
	public int getIdprestamo() {
		return idprestamo;
	}
	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}
	public String getFecha_prestamo() {
		return fecha_prestamo;
	}
	public void setFecha_prestamo(String fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}
	public String getFecha_devolución() {
		return fecha_devolución;
	}
	public void setFecha_devolución(String fecha_devolución) {
		this.fecha_devolución = fecha_devolución;
	}
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public int getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
