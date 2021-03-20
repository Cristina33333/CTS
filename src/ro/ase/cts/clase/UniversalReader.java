package ro.ase.cts.clase;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.readers.Reader;


//fatada pentru readere
public class UniversalReader {

	//punct de legatura cu readere
	//todo
	
	public static List<Aplicant> readAplicants(String fileName, Reader reader){
		
		return reader.aplicantReader();
	}
	

}
