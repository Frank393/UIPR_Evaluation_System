package evaluation;

import java.time.LocalDate;

import javafx.beans.property.SimpleStringProperty;

public class tableColum {


	

	String Id ;
	String Profesor;
	String Modalidad;
	String Termino;
	

	public tableColum (String Id, String Profesor, String Modalidad ,String Termino) {
		this.Id = new String(Id);
		this.Profesor = new String(Profesor);
		this.Modalidad = new String(Modalidad);
		this.Termino = new String(Termino);
	}


	public String getId() {
		return Id;
	}


	public void setId(String Id) {
		this.Id = Id;
	}


	public String getProfesor() {
		return Profesor;
	}


	public void setProfesor(String Profesor) {
		this.Profesor = Profesor;
	}


	public String getModalidad() {
		return Modalidad;
	}


	public void setModalidad(String modalidad) {
		this.Modalidad = Modalidad;
	}


	public String getTermino() {
		return Termino;
	}


	public void setTermino(String termino) {
		this.Termino = termino;
	}
	




}
