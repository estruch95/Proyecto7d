package Modelo;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {
	
	private int id;
	private Date fecha;
	private Empresa empresa;
	
	public Pedido(){
		
	}
	
	public Pedido(Date fecha){
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}
