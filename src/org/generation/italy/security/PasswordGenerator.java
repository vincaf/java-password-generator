package org.generation.italy.security;
import java.util.Scanner;

/* 
L'esercizio di oggi è un (insicurissimo) Password Generator
nome repo: java-password-generator
Create un nuovo progetto java chiamato java-password-generator
Aggiungete un package org.generation.italy.security
Aggiungete una classe PasswordGenerator che contiene un metodo main
Il programma deve fare quanto segue:
salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero
generare (e stampare a video) una password  concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta
La sua password sarà Pinco-Pallo-magenta-2011
*/

public class PasswordGenerator {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Inserisci il tuo nome");
	    String nome = sc.nextLine();
	    
	    System.out.println("Inserisci il tuo cognome");
	    String cognome = sc.nextLine();
	    
	    System.out.println("Inserisci il tuo colore preferito");
	    String colore = sc.nextLine();
	    
	    System.out.println("Inserisci la tua data di nascita");
	    System.out.println("Giorno:");
	    int giorno = sc.nextInt();
	    System.out.println("Mese:");
	    int mese = sc.nextInt();
	    System.out.println("Anno:");
	    int anno = sc.nextInt();
	    
	    System.out.println("Password generata: " + nome + "-" + cognome + "-" + colore + "-" + (giorno + mese + anno));
	}
}
