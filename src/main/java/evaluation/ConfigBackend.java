package evaluation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class ConfigBackend {
    
    int rango = 0;
    File file = new File("./credencials.csv");
    File temp = new File("./temp.csv");
    
    static int[] valen = new int[54];
    //Login_backend user = new Login_backend();
    
    public void fillValen(String Id) throws FileNotFoundException {
    	int sum = 0;
		//FileReader freader = new FileReader(file);
		String test;
		String splitter[] = null; // Split lines
		Scanner counter ;
		counter = new Scanner(file);
		
		while(counter.hasNextLine()) { // Count observations
			test = counter.nextLine(); // Read line
			System.out.println("test: "+test);
			System.out.println(Id + " Es el ID ");
			splitter = test.split(",",58); // Split line'
			System.out.println(splitter[0]);
			if(splitter[0].equals(Id)) { // If ID found, fill valen
				System.out.println("in");
				for(int i = 4;i < 58;i++) {
					valen[sum] = Integer.parseInt(splitter[i]);
					System.out.println("valen: "+splitter[i]);
					sum++;
				}
			}
		}
		counter.close();
    }
    
    public void saveValen(String IDT) throws IOException {
    	int sum = 0;
		//FileReader freader = new FileReader(file);
		String test;
		String splitter[] = null; // Split lines
		Scanner counter;
		counter = new Scanner(file);
		
		// Pass to temp
		FileWriter fw = new FileWriter(temp,true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		while(counter.hasNextLine()) {
			test = counter.nextLine(); // Read line
			System.out.println("test: "+test);
			bw.write(test);
		}
		
		// Re-open file
		counter.close();
		fw.flush();
		fw.close();
		pw.flush();
		pw.close();
		
		counter = new Scanner(temp);
		fw = new FileWriter(file);
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw);
		
		while(counter.hasNextLine()) { // Count observations
			test = counter.nextLine(); // Read line
			splitter = test.split(",",54); // Split line'
			System.out.println(splitter[0]);
			if(splitter[0].equals(IDT)) { // If ID found, fill valen
				bw.write(IDT+","+splitter[1]+","+splitter[2]+","+splitter[3]+","+ valen[0]+","+	valen[1]+","+	valen[2]+","+	valen[3]+","+	valen[4]+","+	valen[5]+","+	valen[6]+","+	valen[7]+","+	valen[8]+","+	valen[9]+","+	valen[10]+","+	valen[11]+","+	valen[12]+","+	valen[13]	
						+","+valen[14]+","+	valen[15]+","+	valen[16]	+","+valen[17]	+","+valen[18]+","+	valen[19]	+","+valen[20]+","+	valen[21]	+","+valen[22]+","+	valen[23]+","+	valen[24]+","+	valen[25]+","+	valen[26]	+","+valen[27]	+","+valen[28]	+","+valen[29]+","+	valen[30]	
						+","+	valen[31]+","+	valen[32]	+","+valen[33]	+","+valen[34]	+","+valen[35]	+","+valen[36]	+","+valen[37]	+","+valen[38]+","+valen[39]	+","+valen[40]	+","+valen[41]+","+	valen[42]+","+	valen[43]+","+	valen[44]+","+	valen[45]+","+	valen[46]+","+	valen[47]+","+	valen[48]+","+	valen[49]+","+	valen[50]+","+	valen[51]+","+	valen[52]+","+	valen[53]+"\n");
			}
			else
				pw.println(test);
		}
		pw.flush();
		pw.close();
		counter.close();
    }
    
    public double[] valenDouble() {
    	double[] valenDouble = new double[54];
    	for (int i = 0;i < 54; i++) {
    		valenDouble[i] = (double) valen[i];
    	}
    	
    	return valenDouble;
    }

    
}