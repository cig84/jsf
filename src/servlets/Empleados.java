package servlets;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import clasesDAO.EmployeesDAO;
import dataBaseHR.Employees;

@ManagedBean
@RequestScoped
public class Empleados {
	
	private EmployeesDAO eDAO = null;
	private List<Employees> empsList = null;
	private String id;
		
	public Empleados() {
		
		this.eDAO = new EmployeesDAO();
	}

	public List<Employees> getempsList() {
			
		return empsList;
	}
	
	@PostConstruct
	public void listarEmpleados(String id) {

		ArrayList<Employees> listaEmpleados = new ArrayList<Employees>();
		listaEmpleados.addAll(this.eDAO.leerEmpleados(getId()));
		this.empsList = listaEmpleados;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
