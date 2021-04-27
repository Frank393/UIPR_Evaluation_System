package evaluation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class ConfigBackend {
    
    int rango = 0;
    File file = new File("./credencials.csv");
    static int[] valen = new int[58];
    
    public void fillValen() throws FileNotFoundException {
    	int sum = 0;
		FileReader freader = new FileReader(file);
		String test;
		String splitter[] = null; // Split lines
		Scanner counter ;
		counter = new Scanner(file);
		
		while(counter.hasNextLine()) { // Count observations
			test = counter.nextLine(); // Read line
			System.out.println(test);
			splitter = test.split(",",58); // Split line
			if(splitter[0].equals("test")) { // If ID found, fill valen
				System.out.println("in");
				for(int i = 4;i < 58;i++) {
					valen[sum] = Integer.parseInt(splitter[i]);
					System.out.println("valen: "+splitter[i]);
					sum++;
				}
			}
			break;
		}
    	
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