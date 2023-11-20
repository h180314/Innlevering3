package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
//		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
		this.innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
//		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
		this.innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
//		throw new UnsupportedOperationException(TODO.method());
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
//		throw new UnsupportedOperationException(TODO.method());
		return this.innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
//		throw new UnsupportedOperationException(TODO.method());
		int plass = -1;
		for(int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] != null) {
				if (innleggtabell[i].erLik(innlegg)) {
					plass = i; 
				}
			}

				
		}
		return plass;
		
	}

	public boolean finnes(Innlegg innlegg) {
//		throw new UnsupportedOperationException(TODO.method());
		Boolean finnes = false;
		for (Innlegg finn_inn: this.innleggtabell) {
			if (finn_inn != null) {
				if (finn_inn.erLik(innlegg)) {
					finnes = true;
				}
			}
			
		}
		return finnes;
	}

	public boolean ledigPlass() {
//		throw new UnsupportedOperationException(TODO.method());
		boolean ledig = false;
		if (nesteledig <= (innleggtabell.length-1)) {
			ledig = true;
		}
		return ledig;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean leggtil = false;
		if (this.ledigPlass()) {
			if (!this.finnes(innlegg)) {
				this.innleggtabell[this.nesteledig] = innlegg;
				this.nesteledig++;
				leggtil = true;
			}
		}
		
		return leggtil;

//		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
//		throw new UnsupportedOperationException(TODO.method());
		
		String st;
		st = Integer.toString(innleggtabell.length) + "\n";
		
		for(int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] != null) {
				st += innleggtabell[i].toString();
				//System.out.println(innleggtabell[i].toString());
			}
		}
		
		return st;
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}