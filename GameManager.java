package com.example.paolo.onebullion;

/**
 * Created by Paolo on 05/06/2016.
 */
public class GameManager {
    // Soldi, mondi espolrati ecc..
	private int coins; // Letto da file
	
	// Non so se possono servirci intanto teniamoli
	private long partialTime = System.nanoTime();
	private long totalTime; // Letto da file e aggiornato a fine sessione
	
	/* Per i mondi facciamo tipo un array? Per esempio:
	 * private int[] citta = new Citta[NUM]; cosi mettiamo a 0 se non è visitato e 1 altrimenti
	 */
	
	/* Poi per il gioco dobbiamo gestire anche degli assistenti per il personaggio, ne sono alcuni, ti invierò la lista poi, credo che si
	 * possano gestire da qui, facciamo che quando assumi un assistente lo tieni per tot tempo quindi faremo una classe apposta, qui ci basta
	 * un array di assistenti che leggiamo da file (per sapere chi sono ecc.) e il numero di assistenti disponibili:
	 * private int numAssist;
	 * private Assistente assistenti = new Assistente[numAssist];
	 */
	
	/* Poi, sempre da file, dobbiamo vedere se ha obbligazioni da vendere, quante ne sono, qual è il loro valore 
	 * e (se ricordo bene hanno una scadenza) la scadenza:
	 * private int numObb;
	 * if(numObb > 0){
	 *     private Obbligazione[] obbligazioni = new Obbligazione[numObb];
	 * E poi dall'array settiamo valore ecc.
	 */
	
	/* Per adesso mi è venuto in mente questo, poi aggiungeremo altro se servirà, ovviamente il tutto dovrà essere salvato al 
	 * termine della sessione.
	 */

}
