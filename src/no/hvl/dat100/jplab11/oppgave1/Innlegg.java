package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	
	protected String bruker;
	protected int id;
	protected String dato;
	protected int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
//		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		
		this.likes = 0;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		
//		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		return this.bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return this.dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return this.id;

	}

	public int getLikes() {
		return this.likes;

	}
	
	public void doLike () {
		this.likes ++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		return (innlegg.getId() == this.id);

	}
	
	@Override
	public String toString() {
		String st = this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n";
		return st;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
