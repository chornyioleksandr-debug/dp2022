package Servlets;

import crud.FileCrud;
import crud.Lab3CrudInterface;

public class ServletConfig implements ServletConfigInterface {
	Lab3CrudInterface l3ci;
	
	public ServletConfig() {
		this.l3ci = new FileCrud();
	}
	
	public void setL3ci(Lab3CrudInterface l3ci) {
		this.l3ci = l3ci;
	}


	@Override
	public Lab3CrudInterface getCrud() {
		return l3ci;
	}

}
