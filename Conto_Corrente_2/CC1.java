/*
# Java_Scuola


Java_Scuola




- Algoritmo "Conto Corrente (CC) - "2" composto da 2 classi
	{
		"CC1": Crea un nuovo conto corrente inizializzato a 3200 €;
		Chiede all'utente se desideri prelevare o versare danaro e preleva o versa la somma inserita dall'utente;
		Stampa il saldo finale.
	}
	{
		"CC2":
			- "saldo": Variabile che memorizza lo stato del conto;
			- "ContoCorrente": Costruttore della classe;
			- "versa": Metodo per il versamento di somme;
			- "preleva": Metodo per il prelievo di somme.
	}
*/

import java.util.*;
public class CC1
{
	public static void main ( String [] args )
	{
		CC2 cc = new CC2(3200);
		int s;
		double v=0,p=0;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println ( " Che operazione desidera effettuare? Digiti \"1\" (uno), se desidera versare; digiti \"2\" (due), se desidera prelevare; 				digiti \"3\" (tre), se desidera visualizzare il Suo saldo; digiti \"0\" (zero), se desidera terminare le operazioni. \n Effettui la Sua scelta ora: \t 				" );
			s = in.nextInt();
			if
			( s == 1 )
			{
				System.out.println ( " \n Quanto desidera versare? Digiti l'importo: \t " );
				v = in.nextDouble();
				cc.versa (v);
			}
			else if
			( s == 2 )
			{
				System.out.println ( " \n Quanto desidera prelevare? Digiti l'importo: \t " );
				p = in.nextDouble();
				cc.preleva (p);
			}
			else if
			( s == 3 )
			{
				System.out.println ( " \n Saldo: \t " + cc . saldo );
			}
			else if
			( s == 0 )
			{
				System.out.println ( " \n Grazie per aver utilizzato questo servizio. Arrivederci. " );
			}
			else
			{
				System.out.println ( " \n Scelta errata! " );
			}
		}
		while
		( s != 0 );
	}
}