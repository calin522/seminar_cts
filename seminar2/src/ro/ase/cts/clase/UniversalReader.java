package ro.ase.cts.clase;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import ro.ase.cts.clase.readers.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversalReader {

	public static List<Aplicant> readAplicants(String filename,Reader reader) throws NumberFormatException, FileNotFoundException{
		return reader.readAplicants(filename);
		
	}
}
