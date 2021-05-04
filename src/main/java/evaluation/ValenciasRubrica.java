package evaluation;

import java.io.IOException;

public class ValenciasRubrica{
	ValenciasRango rango; // Determina que rango se usa
	DataView dv;
	double A,B,C,D; // Factor influencia del Instrumento
	ExternalValues Pa = new ExternalValues();
	ExternalValues Pb = new ExternalValues();
	ExternalValues Pc = new ExternalValues();
	ExternalValues Pd = new ExternalValues();
	ExternalValues Pe = new ExternalValues();
	ExternalValues Pf = new ExternalValues();
	ExternalValues Pg = new ExternalValues();
	ExternalValues Ph = new ExternalValues();
	
	ValenciasRubrica(){
		
	}
	
	double[] CalidadDocente()  throws IOException{
		
		Instruments mm = new Instruments();
		String[] fac = new String[162];
		int status = mm.gettipo();
		int choice = mm.rangoNum();
		
		// v
		rango = new ValenciasRango(choice);
		dv = new DataView(fac[1]);
		double result[] = new double[7];
		A = 0.25;
		B = 0.25;
		C = 0.25;
		D = 0.25;
		
		double I3;
		double M = dv.ObSums()[0];
		double N = dv.ObSums()[1];
		
		//////////////////Dominio de la disciplina////////////////////
		Pa.I1 = dv.ISum(22,31) - 1;
		Pa.I1A = dv.ISumO(21,27) - 1;
		
		System.out.println("I1: "+Pa.I1);
		System.out.println("I1A: "+Pa.I1A);
		
		Pa.I1P = ((M/(M+N))*Pa.I1)+((N/(M+N))*Pa.I1A);
		
		Pa.I2 = dv.EvidenceCalc((int)(dv.RNum(46)));
		Pa.I3 = (dv.ISum(64,69))*0.75;
		Pa.I3A = (dv.ISumO(64,67))*0.75;
		Pa.I4 = dv.RNum(99)*0.75;
		
		I3 = status == 1 ? Pa.I3 : Pa.I3A;
		Pa.puntuacion = ((A*Pa.I1P)+(B*Pa.I2)+(C*I3)+(D*Pa.I4))*(rango.valen1A / 3);
		result[0] = Pa.puntuacion;
		//////////////////////////////////////////////////////////////
		
		//////////Habilidad para organizar el contenido...///////////
		Pb.I1 = ((dv.ISum(23,27)+dv.RNum(27)+dv.RNum(34)+dv.RNum(35))/4) - 1;
		Pb.I1A = ((dv.RNumO(23)+dv.RNumO(25)+dv.RNumO(27)+dv.RNumO(28)+dv.RNumO(40))/5) - 1;
		Pb.I1P = ((M/(M+N))*Pb.I1)+((N/(M+N))*Pb.I1A);
		
		Pb.I2 = dv.EvidenceCalc((int)(dv.RNum(47)));
		Pb.I3 = dv.ISum(70,74)*0.75;
		Pb.I3A = dv.ISumO(68,77)*0.75;
		
		I3 = status == 1 ? Pb.I3 : Pb.I3A;
		
		Pb.puntuacion = (((A*Pb.I1P)+(B*Pb.I2)+(C*I3))*(rango.valen1B / 3)) / (1-D);
		result[1] = Pb.puntuacion;
		//////////////////////////////////////////////////////////////
		
		////////Conocimiento de los desarrollos actuales...//////////
		Pc.I2 = dv.EvidenceCalc((int)(dv.RNum(48)));
		Pc.I3 = ((dv.RNum(68)+dv.RNum(69))/2)*0.75;
		Pc.I3A = 0;
		Pc.I4 = dv.RNum(99)*0.75;
		
		I3 = status == 1 ? Pc.I3 : Pc.I3A;
		
		Pc.puntuacion = status == 1 ? (((B*Pc.I2)+(C*I3)+(D*Pc.I4))*(rango.valen1C / 3))/(1-A): (((B*Pc.I2)+(D*Pc.I4))*(rango.valen1C / 3))/(1-A-C);
		result[2] = Pc.puntuacion;
		//////////////////////////////////////////////////////////////
		
		////////Habilidad para relacionar la disciplina...//////////
		Pd.I1 = dv.RNum(31) - 1;
		Pd.I1A = dv.RNumO(27) - 1;
		Pd.I1P = ((M/(M+N))*Pd.I1)+((N/(M+N))*Pd.I1A);
		
		Pd.I2 = dv.EvidenceCalc((int)(dv.RNum(49)));
		Pd.I3 = ((dv.RNum(66)+dv.RNum(67))/2)*0.75;
		Pd.I3A = ((dv.RNumO(65)+dv.RNumO(66)+dv.RNumO(67))/3)*0.75;
		
		I3 = status == 1 ? Pd.I3 : Pd.I3A;
		
		Pd.puntuacion = (((A*Pd.I1P*(rango.valen1D / 3))+(B*Pd.I2)+(C*I3*(rango.valen1D / 3))) / (1-D))+1;
		result[3] = Pd.puntuacion;
		//////////////////////////////////////////////////////////////
		
		//////////Habilidad para promover y ampliar...////////////////
		Pe.I1 = ((dv.RNum(21)+dv.RNum(23)+dv.RNum(31)+dv.RNum(33))/4)-1;
		Pe.I1A = ((dv.RNumO(22)+dv.RNumO(25)+dv.RNumO(28)+dv.RNumO(29))/4)-1;
		Pe.I1P = ((M/(M+N))*Pe.I1)+((N/(M+N))*Pe.I1A);
		
		Pe.I2 = dv.EvidenceCalc((int)(dv.RNum(50)));
		Pe.I3 = dv.ISum(75,79) * 0.75;
		Pe.I3A = dv.ISumO(78,82)*0.75;
		Pe.I4 = dv.RNum(99) * 0.75;
		
		I3 = status == 1 ? Pe.I3 : Pe.I3A;
		
		Pe.puntuacion = ((A*Pe.I1P)+(B*Pe.I2)+(C*I3)+(D*Pe.I4))*(rango.valen1E / 3);
		result[4] = Pe.puntuacion;
		//////////////////////////////////////////////////////////////
		
		/////////Habilidad para desarrollar y utilizar.../////////////
		Pf.I1 = ((dv.ISum(26,30)+dv.RNum(39))/2) - 1;
		Pf.I1A = ((dv.RNumO(28)+dv.RNumO(32)+dv.RNumO(33)+dv.RNumO(38))/4) - 1;
		Pf.I1P = ((M/(M+N))*Pf.I1)+((N/(M+N))*Pf.I1A);
		
		Pf.I2 = dv.EvidenceCalc((int)(dv.RNum(51)));
		Pf.I3 = dv.ISum(80,83)*0.75;
		Pf.I3A = ((dv.RNumO(67)+dv.RNumO(70)+dv.RNumO(71)+dv.RNumO(72)+dv.RNumO(76)+dv.ISumO(79,82))/6)*0.75;
		Pf.I4 = ((dv.RNum(99)+dv.RNum(102)+dv.RNum(103))/3)*0.75;
		
		I3 = status == 1 ? Pf.I3 : Pf.I3A;
		
		Pf.puntuacion = ((A*Pf.I1P)+(B*Pf.I2)+(C*I3)+(D*Pf.I4))*(rango.valen1F / 3);
		result[5] = Pf.puntuacion;
		//////////////////////////////////////////////////////////////
		
		//////Disponibilidad y eficacia en la orientacion...//////////
		Pg.I1 = ((dv.RNum(41)+dv.RNum(44)+dv.RNum(45))/3)-1;
		Pg.I1A = ((dv.RNumO(29)+dv.RNumO(30)+dv.RNumO(31)+dv.RNumO(37))/4)-1;
		
		double I1g = ((M/(M+N))*Pg.I1)+((N/(M+N))*Pg.I1A);
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Instrumento 1h
		double I1C = (dv.RNum(19)+dv.RNum(20))/2;
		Ph.I1 = (((I1C-2)*4 < 0 ? 2 : (I1C-2)*4)+(((dv.RNum(29)+dv.ISum(36,38)+dv.RNum(40)+dv.RNum(42))/4))/2) - 1;
		Ph.I1A = (((I1C-2)*4 < 2 ? 2 : (I1C-2)*4)+(((dv.RNumO(31)+dv.RNumO(34)+dv.RNumO(35)+dv.RNumO(36))/4))/2) - 1;
		double I1h = ((M/(M+N))*Ph.I1)+((N/(M+N))*Ph.I1A) - 2; // Change this
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		Pg.I3 = 0;
		Pg.I3A = dv.RNumO(75)*0.75;
		Pg.I4 = ((dv.RNum(84)+dv.RNum(85))/2)*0.75;
		//////////////////////////////////////////////////////////////
		
		///////Posecion de los atributos de integridad.../////////////
		Ph.I1P = (I1g + I1h)/2;

		Ph.I2 = dv.EvidenceCalc((int)(dv.RNum(52)));
		Ph.I3 = dv.RNum(76)*0.75;
		Ph.I3A = ((dv.RNumO(74)+dv.RNumO(75)+dv.RNumO(77))/3)*0.75;
		Ph.I4 = ((dv.RNum(86)+dv.RNum(87)+dv.ISum(89,94)+dv.RNum(96)+dv.RNum(97)+dv.RNum(101)+dv.RNum(103))/7) * 0.75;
		double I4 = (Pg.I4 + Ph.I4)/2;
		
		I3 = status == 1 ? Ph.I3 : (Pg.I3A + Ph.I3A)/2;
		
		Ph.puntuacion = ((A*Ph.I1P)+(B*Ph.I2)+(C*I3)+(D*I4))*(rango.valen1GH / 3);
		result[6] = Ph.puntuacion;
		//////////////////////////////////////////////////////////////
		
		return result;
	}
	
	double[] ServicioInstitucion() throws IOException {
		String[] fac = new String[162];
		fac = Instruments.values;
		Instruments mm = new Instruments();
		int choice = mm.rangoNum();
		
		rango = new ValenciasRango(choice);
		dv = new DataView(fac[1]);
		double result[] = new double[4];
		B = 0.8; // Autoevaluacion narrativa
		D = 0.2; // Evaluacion del director
		
		//////////Trabajo en comites de facultad...//////////////////
		Pa.I2 = dv.EvidenceCalc((int)(dv.RNum(53)));
		Pa.I4 = ((dv.RNum(92) + dv.RNum(100))/2) * 0.75;
		
		Pa.puntuacion = ((B*Pa.I2)+(D*Pa.I4))*(rango.valen2A/3);
		result[0] = Pa.puntuacion;
		////////////////////////////////////////////////////////////
		
		///////////Participacion y aportacion a reuniones...////////
		/////////Servicio en comites y en organizaciones.../////////
		
		Pb.I2 = dv.EvidenceCalc((int)(dv.RNum(54)));
		Pb.I4 = ((dv.RNum(87)+dv.RNum(88)+dv.RNum(93))/3)*0.75;
		
		Pc.I2 = dv.RNum(54);
		Pc.I4 = dv.RNum(92) * 0.75;
		
		Pc.I4 = (Pb.I4 + Pc.I4) / 2;
		
		Pc.puntuacion = ((B*Pc.I2)+(D*Pc.I4))*(rango.valen2BC/3);
		result[1] = Pc.puntuacion;
		////////////////////////////////////////////////////////////
		
		////////////Colaboracion en organizaciones...///////////////
		///////////Asistencia a actos oficiales/////////////////////
		Pd.I2 = dv.EvidenceCalc((int)(dv.RNum(55)));
		Pe.I4 = dv.RNum(93)*0.75;
		
		Pe.puntuacion = ((B*Pd.I2)+(D*Pe.I4))*(rango.valen2DE/3);
		result[2] = Pe.puntuacion;
		////////////////////////////////////////////////////////////
		
		////////////Designacion como director/a...//////////////////
		////////Participacion en organismos de gobierno...//////////
		Pf.I2 = dv.EvidenceCalc((int)(dv.RNum(56)));
		Pg.I2 = dv.EvidenceCalc((int)(dv.RNum(56)));
		
		Pg.puntuacion = Pg.I2*(rango.valen2FG/3);
		result[3] = Pg.puntuacion;
		////////////////////////////////////////////////////////////
		
		return result;
	}
	
	double ServicioComunidad() throws IOException {
		String[] fac = new String[162];
		fac = Instruments.values;
		Instruments mm = new Instruments();
		int choice = mm.rangoNum();
		
		rango = new ValenciasRango(choice);
		dv = new DataView(fac[1]);
		double result;
		B = 1.0; // Autoevaluacion narrativa
		int M = dv.ObSums()[0];
		int N = dv.ObSums()[1];
		
		Pa.I2 = dv.EvidenceCalc((int)(dv.RNum(57)));
		Pb.puntuacion = (B*Pa.I2)*(rango.valen3AB/3);
		result = Pb.puntuacion;
		
		return result;
	}
	
	double[] InvestigacionTrabajo() throws IOException {
		String[] fac = new String[162];
		fac = Instruments.values;
		Instruments mm = new Instruments();
		int choice = mm.rangoNum();
		
		rango = new ValenciasRango(choice);
		dv = new DataView(fac[1]);
		double result[] = new double[3];
		B = 0.9; // Autoevaluacion narrativa
		D = 0.1; //Evaluacion del director
		int M = dv.ObSums()[0];
		int N = dv.ObSums()[1];
		
		Pa.I2 = dv.EvidenceCalc((int)(dv.RNum(58)));
		Pb.I2 = dv.EvidenceCalc((int)(dv.RNum(59)));
		Pc.I2 = dv.EvidenceCalc((int)(dv.RNum(60)));
		Pb.I4 = dv.RNum(98)*0.75;
		
		Pa.puntuacion = Pa.I2*(rango.valen4A/3);
		result[0] = Pa.puntuacion;
		
		Pb.puntuacion = ((B*Pb.I2)+(D*Pb.I4))*(rango.valen4B/3);
		result[1] = Pb.puntuacion;
		
		Pe.puntuacion = Pc.I2*(rango.valen4CDE/3);
		result[2] = Pe.puntuacion;
		
		return result;
	}
	
	double[] CrecimientoDesarrollo() throws IOException {
		String[] fac = new String[162];
		fac = Instruments.values;
		Instruments mm = new Instruments();
		int choice = mm.rangoNum();
		
		rango = new ValenciasRango(choice);
		dv = new DataView(fac[1]);
		double result[] = new double[3];
		B = 0.9; // Autoevaluacion narrativa
		D = 0.1; //Evaluacion del director
		int M = dv.ObSums()[0];
		int N = dv.ObSums()[1];
		
		Pa.I2 = dv.EvidenceCalc((int)(dv.RNum(61)));
		Pd.I2 = dv.EvidenceCalc((int)(dv.RNum(62)));
		Pe.I2 = dv.EvidenceCalc((int)(dv.RNum(63)));
		Pf.I4 = dv.RNum(94)*0.75;
		
		Pa.puntuacion = Pa.I2*(rango.valen5ABC/3);
		result[0] = Pa.puntuacion;
		
		Pd.puntuacion = Pd.I2*(rango.valen5D/3);
		result[1] = Pd.puntuacion;
		Pe.puntuacion = ((B*Pe.I2)+(D*Pf.I4))*(rango.valen5EF/3);
		result[2] = Pe.puntuacion;
		
		return result;
	}
  double Total(int choice, int status) throws IOException {
		
		double sum = 0;
		
		for(int i = 0; i < 7; i++)
			sum += CalidadDocente()[i];
		
		for(int i = 0; i < 4; i++)
			sum += ServicioInstitucion()[i];
		
		sum += ServicioComunidad();
		
		for(int i = 0; i < 3; i++)
			sum += InvestigacionTrabajo()[i];
		
		for(int i = 0; i < 3; i++)
			sum += CrecimientoDesarrollo()[i];
		
		return sum;
	}
}

class ExternalValues{
	int M; // Cantidad de evaluaciones I1
	int N; // Cantidad de evaliaciones I1A
	double I1P; // Ecuacion I1
	double I1,I1A,I2,I3,I3A,I4; // Promedio instrumentos
	double puntuacion;
}
