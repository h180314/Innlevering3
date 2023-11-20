package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {
//	private Blogg samling;
//	private String mappe;
//	private String filnavn;

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

//		throw new UnsupportedOperationException(TODO.method());
		Boolean skrevet = false;
		try {
			PrintWriter skriver = new PrintWriter(mappe + filnavn);
			skriver.print(samling.toString());
			skrevet = true;
			skriver.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return skrevet;
	}
}
