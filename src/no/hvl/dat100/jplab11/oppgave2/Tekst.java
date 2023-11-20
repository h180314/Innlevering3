package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	private String tekst;
	
	public Tekst () {	
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
//		throw new UnsupportedOperationException(TODO.constructor("Tekst"));
		
		super(id,bruker,dato);
		this.tekst = tekst;
		
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
//		throw new UnsupportedOperationException(TODO.constructor("Tekst"));'
		super(id,bruker,dato,likes);
		this.tekst = tekst;
	}
	
	public String getTekst() {
//		throw new UnsupportedOperationException(TODO.method());
		return this.tekst;

	}

	public void setTekst(String tekst) {
//		throw new UnsupportedOperationException(TODO.method());
		this.tekst = tekst;
	}

	@Override
	public String toString() {
//		throw new UnsupportedOperationException(TODO.method());
		String st = "TEKST\n"+ this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n" + this.tekst + "\n";
		return st;
		
		

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
