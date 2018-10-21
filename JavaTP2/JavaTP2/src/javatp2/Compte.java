package JavaTP2;
import java.util.Scanner;

public class Compte {
	Scanner output = new Scanner(System.in);       

	//Compte obj=new Compte();//Bug ici, pq je ne sais pas 


	public int numCompte;
	public char typeCompte;
	public double valeurCompte;

	public LigneComptable ligne;

	public Compte(){}

	public Compte(int unNumCompte, char leTypeCompte, double laValeurCredite, LigneComptable uneLigne){
		this.numCompte=unNumCompte;
		this.typeCompte=leTypeCompte;
		this.valeurCompte=laValeurCredite;
		this.ligne=uneLigne;
	}
	
	public int 			  getNumCompte		()         		   {return numCompte;}
	public char 		  getType			()         		   {return typeCompte;}
	public double 		  getValeurCompte	()		   		   {return valeurCompte;}
	public LigneComptable getLigne			()		   		   {return ligne;}


	public void 		  setNumCompte		(int num)          {numCompte=num;}
	public void 		  setType			(char type)        {typeCompte=type;}
	public void 		  setValeurCompte	(double valeur)    {valeurCompte=valeur;}
	public void 		  setLigneComptable	(LigneComptable li){ligne=li;}

	
	
	
	public void creerCompte(Compte bla){ 
		int numcpt1=500; 
		int numcpt2=1000;
		int numcpt3=50;
		boolean boolVerNum=false; 
		int num=0; 
		boolean boolVerType=false; 
		String userinput=""; 
		char inputa;

		System.out.println("###########################");
		System.out.println("##### CREATION COMPTE #####");
		System.out.println("###########################");
		
			System.out.println("Entrez votre numéro de compte :");
			num=output.nextInt();
			this.setNumCompte(num); 
		
			//Pour heritage, enlever la possibilité 'e' donc enlever le if(this.getType()=='e'){blabla} dans méthode afficherCompte(compte, lignecomptable)
			//Donc enlever le taux des variables et des possiblités d'affichage 
			System.out.println("Entrez le type de compte (e/ j / c) : ");
			userinput=output.next();
			inputa = userinput.charAt(0);
			this.setType(inputa); 

			System.out.println("Montant crédité, positif ou négatif : ");
			this.setValeurCompte(output.nextInt());

			
	}


	
	
	public void afficherCompte(Compte bla, LigneComptable ligneC){
		System.out.println("############################");
		System.out.println("##### AFFICHAGE COMPTE #####");
		System.out.println("############################");
		System.out.println();
		//Compte cpt = new Compte();


		System.out.println("Numéro de compte : "+ this.getNumCompte());
		System.out.println("Type de compte : " + this.getType());
		System.out.println("Valeur crédité : " + this.getValeurCompte());

		ligneC.afficherLigneComptable(ligneC);
	}
	
	
	
	
	public void creerLigne(LigneComptable LC, Compte mp){
		LC.creerLigneComptable();
		
		mp.setValeurCompte(LC.getSomme());
		
		/*mp.afficherCompte(mp, LC);
		LC.afficherLigneComptable(LC);*/
	}
	
	
	
	
	
	

	public static void main(String[] args){
		Scanner output = new Scanner(System.in);            
		int option=0;
		boolean boolVerNum=false;
		boolean boolVerType=false;
		
		LigneComptable LIC = new LigneComptable();
		Compte CM = new Compte();

		
		
		System.out.println("####################################");
		System.out.println("############### MENU ###############");    
		System.out.println("####################################");
		System.out.println("1.Créer compte ");System.out.println("2.Afficher compte");System.out.println("3.Ligne comptable ");System.out.println("4.sortir");
		System.out.println();
		System.out.println("Choisissez votre option:");
		option=output.nextInt();


		switch(option){
		case 1:
			CM.creerCompte(CM);
			CM.afficherCompte(CM, LIC);
			break;
		case 2:
			CM.afficherCompte(CM, LIC);
			break;

		case 3:
			CM.creerLigne(LIC, CM);
			LIC.afficherLigneComptable(LIC);
			CM.afficherCompte(CM, LIC);
			break;
		case 4:
			System.out.println("Vous êtes sortie");
		}
	}
}



