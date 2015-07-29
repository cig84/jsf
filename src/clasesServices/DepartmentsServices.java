package clasesServices;

import clasesDAO.DepartmentsDAO;
import dataBaseHR.Departments;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

public class DepartmentsServices {
	
	private static DepartmentsDAO dDAO = null;
	private final static Logger log = LogManager.getRootLogger();
	
	public DepartmentsServices() {	
		
		log.trace("se crea el objeto DepartmentsDAO");
		this.dDAO = new DepartmentsDAO();
		
	}	

	public ArrayList<Departments> listarDepartamentos() {

		log.trace("entra en el m�todo listarDepartamentos");
		ArrayList<Departments> listaDepartamento = new ArrayList<Departments>();
		listaDepartamento.addAll(this.dDAO.obtenerDepartamentos());
		return listaDepartamento;
	}

}
