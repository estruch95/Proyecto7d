import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Modelo.Empresa;
import Modelo.Pedido;


public class Program {

	static Session session;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			session = HibernateUtilities.getSessionFactory().openSession();
			session.beginTransaction();
			
			Empresa e = new Empresa();
			e.setCIF("12345-O");
			e.setNombre("Mobilendo");
			e.setEmpleados(50);
			e.getDireccion().setCalle("C/Inventada");
			e.getDireccion().setCp(46450);
			e.getDireccion().setPoblacion("Benifaio");
			e.addPedido(new Pedido(new java.util.Date()));
			e.addPedido(new Pedido(new java.util.Date()));
			
			session.save(e);
			
			consultarEmpresaPorCIF("12345-O");
			
			session.getTransaction().commit();
			
			
			session.close();
			HibernateUtilities.getSessionFactory().close();
	}
	
	public static void consultarEmpresaPorCIF(String CIF){
		
		Query query = session.createQuery("from Empresa as empresa where empresa.CIF = '"+CIF+"'");
		List<Empresa> empresas = query.list();
		
		for(Empresa e:empresas){
			System.out.println("He recuperado la empresa con nombre: "+e.getNombre());
		}
	}

}
