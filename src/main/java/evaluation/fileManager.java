package evaluation;

import java.util.*;
import java.io.*;

public class fileManager {



	public int login(String IDT , String passT ) {

		String Id = "";
		String pass = "";
		int found = 0;
		File loginCreds;
		Scanner scanner;
	
		try {
			loginCreds = new File("./credencials.csv");
			scanner = new Scanner(loginCreds);

			while(scanner.hasNextLine() && found != 1) {
				String data = scanner.nextLine();
				String[] params = data.split(",", 20);
			
				Id= params[0];
				pass = params[1];

				if (Id.trim().equals(IDT) && pass.trim().equals(passT))
				{
				
					found = 1;
				}

			}
			scanner.close();


		}catch(Exception ex) {

			System.out.print("404 "+ ex);
		}
		return found;



	}
	public int register(String IDT , String passT, String name , String lastName) {

		File registerCreds;

		try {
			registerCreds = new File("./credencials.csv");
			FileWriter fw = new FileWriter("./credencials.csv",true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(IDT+","+passT+","+name+","+lastName+","+ 16+","+	12+","+	8+","+	6+","+	6+","+	9+","+	10+","+	3+","+	4+","+	2+","+	3+","+	2+","+	2+","+	4	
					+","+4+","+	3+","+	3	+","+3	+","+15+","+	10	+","+10+","+	6	+","+7+","+	9+","+	8+","+	3+","+	3	+","+2	+","+3	+","+2+","+	3	
					+","+	4+","+	5	+","+4	+","+3	+","+3	+","+13	+","+10	+","+12+","+6	+","+5	+","+9+","+	8+","+	2+","+	3+","+	2+","+	2+","+	2+","+	5+","+	5+","+	4+","+	4+","+	4+","+	4);
			pw.flush();
			pw.close();


		}catch(Exception ex) {

			System.out.print("404 "+ ex);
		}
		return 0;
	}

	public String[] combobox(String ID , int IDE) {

		String[] ops;
		File instru;
		int found = 0;
		String NIDE ;
		

		String[] ap = new String[162] ;


		NIDE = String.valueOf(IDE); 

		System.out.println("NIDE:"+NIDE);
		try {
			instru = new File("./instrumentos.csv");
			Scanner scanner = new Scanner(instru);

			while(scanner.hasNextLine()) {
				String data = scanner.nextLine();
				ops = data.split(",", 170);
				

				if (ops[2].trim().equals(ID) && ops[1].trim().equals("FALSE") && ops[15].trim().equals(NIDE) )
				{

					int j = 3;
					for (int i = 0;i < 162; i++ ) {
						ap[i]  = ops[j];
						j++;

					}

				}
			}
			scanner.close();


		}catch(Exception ex) {

			System.out.print("404 "+ ex);
		}


		return ap;

	}

	

	public void borrarEV3( int IDE) throws IOException {


		String[] ops;
		File instru;
		String[] ap = new String[162];

		String NIDE = String.valueOf(IDE); 
	
		FileWriter fw = new FileWriter("./temp.csv");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);

		try {
			instru = new File("./instrumentos.csv");
			Scanner scanner = new Scanner(instru);

			while(scanner.hasNextLine()) {
				String data = scanner.nextLine();
				ops = data.split(",", 170);
				

				if (!ops[15].trim().equals(NIDE) )
				{

					for(int i = 0 ; i < ops.length ;i++) {
						pw.print(ops[i]+",");	
					
					}
					pw.println(" ");

				}
			}
			pw.flush();
			pw.close();
			scanner.close();


		}catch(Exception ex) {

			System.out.print("404 "+ ex);
		}


		FileWriter fw2 = new FileWriter("./instrumentos.csv");
		BufferedWriter bw2 = new BufferedWriter(fw2);
		PrintWriter pw2 = new PrintWriter(bw2);
		try {
			instru = new File("./temp.csv");
			Scanner scanner = new Scanner(instru);

			while(scanner.hasNextLine()) {
				String data = scanner.nextLine();
				ops = data.split(",", 170);
			


				for(int i = 0 ; i < ops.length ;i++) {
					pw2.print(ops[i]+",");	
				}
				pw2.println(" ");


			}
			pw2.flush();
			pw2.close();
			scanner.close();


		}catch(Exception ex) {

			System.out.print("404 "+ ex);
		}




	}

	public String[] IDGen() {

		String[] ops;
		File instru;
		int found = 0;
		int i = 0;

		String[] ap = new String[162] ;

		try {
			instru = new File("./instrumentos.csv");
			Scanner scanner = new Scanner(instru);

			while(scanner.hasNextLine()) {
				String data = scanner.nextLine();
				ops = data.split(",", 170);
				



				int j = 3;
				
					ap[i]  = ops[15];
					j++;
					System.out.println("404    "+ap[i]);
				i++;
			}
			scanner.close();


		}catch(Exception ex) {

			System.out.print("404 "+ ex);
		}


		return ap;

	}

}
