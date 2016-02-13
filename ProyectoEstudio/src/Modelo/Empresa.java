package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String CIF;
	private String nombre;
	private int empleados;
	private List<Pedido> pedidosEmpresa = new ArrayList<Pedido>();
	private Direccion direccion;
	
	public Empresa(){
		setDireccion(new Direccion());
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEmpleados() {
		return empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}

	public List<Pedido> getPedidosEmpresa() {
		return pedidosEmpresa;
	}

	public void setPedidosEmpresa(List<Pedido> pedidosEmpresa) {
		this.pedidosEmpresa = pedidosEmpresa;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
		this.direccion.setEmpresa(this);
	}
	
	public void addPedido(Pedido pedido){
		pedido.setEmpresa(this);
		this.pedidosEmpresa.add(pedido);
	}
	
}
