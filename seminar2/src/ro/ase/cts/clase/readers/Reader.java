package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class Reader {

	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException, NumberFormatException;
		
	
}
