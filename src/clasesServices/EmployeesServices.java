package clasesServices;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import clasesDAO.EmployeesDAO;
import dataBaseHR.Employees;

/**
 * 
 * @author Francesco
 * En esta clase declaramos los m�todos a los cuales el usuario puede acceder.
 * Esta clase inicializa un objeto EmployeesDAO que tiene acceso a la base de datos a trav�s de los
 * m�todos declarados en la misma clase.
 * Esta clase es la que se encarga de obtener una conecci�n a la base de datos llamando el metodo
 * correspondiente de la clase SessionManager, de declarar el inicio de una transacci�n y setear
 * la sessi�n abierta para el objeto EmployeesDAO creado. Tambi�n se encarga de hacer el commit o
 * el roolback de la transacc�on si hay alg�n fallo en la ejecuci�n, as� como de cerrar la sessi�n 
 * cuando el metodo llamado haya terminado su ejecuci�n, con o sin fallos.
 *
 */

public class EmployeesServices {
	
	private static EmployeesDAO empDAO = null;
	private final static Logger log = LogManager.getRootLogger();
	
	public EmployeesServices() {
		
		log.trace("se crea el objeto EmployeesDAO");
		this.empDAO = new EmployeesDAO();
	}
	
	
	public ArrayList<Employees> obtenerEmplPorDept(String id) {

		log.trace("entra en el m�todo obtenerEmplPorDept");
		ArrayList<Employees> listaEmpleados = new ArrayList<Employees>();
		listaEmpleados.addAll(this.empDAO.obtenerEmpleadosporId(id));
		return listaEmpleados;
	}
	

}
