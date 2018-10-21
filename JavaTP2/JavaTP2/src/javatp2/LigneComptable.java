package JavaTP2;
import java.util.Scanner;

public class LigneComptable {


	Scanner input = new Scanner(System.in);
	int numCompte;
	double sommeCredite;
	String dateOp;
	int motif;
	int methode;

	public LigneComptable() {}

	public LigneComptable(int leNum, double laSsomme, String laDate, int leMotif, int laMet) {
		this.numCompte = leNum;
		this.sommeCredite = laSsomme;
		this.dateOp = laDate;
		this.motif = leMotif;
		this.methode = laMet;
	}

	
	

	public int 	  getNum    () 				  {return numCompte;}
	public double getSomme  () 				  {return sommeCredite;}
	public String getDate   () 				  {return dateOp;}
	public int 	  getMotif  () 				  {return motif;}
	public int 	  getMethode() 				  {return methode;}

	public void   setNum	(int unNum) 	  {numCompte = unNum;}
	public void   setSomme  (double uneSomme) {sommeCredite = uneSomme;}
	public void   setDate   (String uneDate)  {dateOp = uneDate;}
	public void   setMotif  (int unMotif)     {motif = unMotif;}
	public void   setMethode(int uneMethode)  {methode = uneMethode;}


	public double creerLigneComptable() {
		boolean boNum = false;
		boolean boMotif = false;
		boolean boMethode = false;

		int clcnum = 0;
		int clcmotif = 0;
		int clcmethode = 0;

		System.out.println("####################################");
		System.out.println("##### CREATION LIGNE COMPTABLE #####");
		System.out.println("####################################");

			//LigneComptable li = new LigneComptable();

			System.out.println("Numéro compte: ");														this.setNum(input.nextInt());

			System.out.println("Somme crédité : ");														this.setSomme(input.nextDouble());		input.nextLine();

			System.out.println("Date opération (jj/mm/aaaa):");											this.setDate(input.nextLine());

			System.out.println("Motif d'achat ((1)salaire, (2)loyer, (3)alimentation, (4)divers) :");	this.setMotif(input.nextInt());

			System.out.println("Méthode de paiement ((1)CB, (2)Chèque, (3)Virement) : ");				this.setMethode(input.nextInt());

			return this.getSomme();
	}

	
	
	public void afficherLigneComptable(LigneComptable liAffichage) {

		System.out.println("#####################################");
		System.out.println("##### AFFICHAGE LIGNE COMPTABLE #####");
		System.out.println("#####################################");
		System.out.println();
		System.out.println("Numéro de compte: " + liAffichage.getNum());
		System.out.println("Somme crédité:    " + liAffichage.getSomme());
		System.out.println("Date operation:   " + liAffichage.getDate());
		System.out.println("Motif : 		  " + liAffichage.getMotif());
		System.out.println("Méthode :  		  " + liAffichage.getMethode());
	}

}

