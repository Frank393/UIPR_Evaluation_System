package evaluation;

public class ValenciasRango extends ValenciasCapsule{

	
	static double[] valen = new double[54];
	
	
	public static double[] getValen() {
		return valen;
	}



	public static void setValen(double[] valen) {
		ValenciasRango.valen = valen;
	}



	ValenciasRango(int choice){
		
		switch(choice) {
		case 1:
			auxiliar();
			break;
		case 2:
			asociado();
			break;
		case 3:
			catedratico();
			break;
		}
	}
	
	void auxiliar() { // Catedratico auxiliar
		
		
		// Calidad docente
		valen1A = valen[0];
		valen1B = valen[1];
		valen1C = valen[2];
		valen1D = valen[3];
		valen1E = valen[4];
		valen1F = valen[5];
		valen1GH = valen[6];
		
		// Servicio a la institucion
		valen2A = valen[7];
		valen2BC = valen[8];;
		valen2DE = valen[9];
		valen2FG = valen[10];
		
		// Servicio a la comunidad
		valen3AB = valen[11];
		
		// Investigacion y trabajo creativo
		valen4A = valen[12];
		valen4B = valen[13];
		valen4CDE = valen[14];
		
		// Crecimiento y desarrollo profesional
		valen5ABC = valen[15];
		valen5D = valen[16];
		valen5EF = valen[17];
	}
	
	void asociado() { // Catedratico asociado
		// Calidad docente
		valen1A = valen[18];
		valen1B = valen[19];
		valen1C = valen[20];
		valen1D = valen[21];
		valen1E = valen[22];
		valen1F = valen[23];
		valen1GH = valen[24];
		
		// Servicio a la institucion
		valen2A = valen[25];
		valen2BC = valen[26];
		valen2DE = valen[27];
		valen2FG = valen[28];
		
		// Servicio a la comunidad
		valen3AB = valen[29];
		
		// Investigacion y trabajo creativo
		valen4A = valen[30];
		valen4B = valen[31];
		valen4CDE = valen[32];
		
		// Crecimiento y desarrollo profesional
		valen5ABC = valen[33];
		valen5D = valen[34];
		valen5EF = valen[35];
	}
	
	void catedratico() { // Catedratico
		// Calidad docente
		valen1A = valen[36];
		valen1B = valen[37];
		valen1C = valen[38];
		valen1D = valen[39];
		valen1E = valen[40];
		valen1F = valen[41];
		valen1GH = valen[42];
		
		// Servicio a la institucion
		valen2A = valen[43];
		valen2BC = valen[44];
		valen2DE = valen[45];
		valen2FG = valen[46];
		
		// Servicio a la comunidad
		valen3AB = valen[47];
		
		// Investigacion y trabajo creativo
		valen4A = valen[48];
		valen4B = valen[49];
		valen4CDE = valen[50];
		
		// Crecimiento y desarrollo profesional
		valen5ABC = valen[51];
		valen5D = valen[52];
		valen5EF = valen[53];
	}
}