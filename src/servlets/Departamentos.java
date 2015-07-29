package servlets;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import clasesDAO.DepartmentsDAO;
import dataBaseHR.Departments;
	
@ManagedBean
@RequestScoped
public class Departamentos {
		
	private DepartmentsDAO dDAO = null;
	private List<Departments> deptsList = null;
	private String selectedDept;
		
	public Departamentos() {
		
		this.dDAO = new DepartmentsDAO();
	}

	public List<Departments> getdeptsList() {
			
		return deptsList;
	}
	
	@PostConstruct
	public void listarDepartamentos() {

		ArrayList<Departments> listaDepartamento = new ArrayList<Departments>();
		listaDepartamento.addAll(this.dDAO.obtenerDepartamentos());
		this.deptsList = listaDepartamento;
	}

	public String getSelectedDept() {
		return selectedDept;
	}

	public void setSelectedDept(String selectedDept) {
		this.selectedDept = selectedDept;
	}


}
