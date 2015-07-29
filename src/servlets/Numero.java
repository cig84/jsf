package servlets;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Numero {
	
	private int num = 10;
	
	public Numero() {
		
	}

	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}

	
	public void mostrarNum() {
		
		this.num ++;

	}


}
