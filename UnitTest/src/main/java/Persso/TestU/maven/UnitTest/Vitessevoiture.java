package Persso.TestU.maven.UnitTest;


public class Vitessevoiture {
public String vitesse;
	
	public Vitessevoiture(){
		Ftc ftc = new Ftc();
		Pieton ptn = new Pieton();
		
		String etatftc= ftc.status;
		String etatptn= ptn.status;
		
		if(etatftc =="vert") {
			if(etatptn== "attente") {
				vitesse = "rapide";
			}
			if(etatptn== "traverse") {
				vitesse = "arret";
			}
			if(etatptn== "hesitant") {
				vitesse = "lente";
			}
		}
		if(etatftc =="orange") {
			if(etatptn== "attente") {
				vitesse = "lente";
			}
			if(etatptn== "traverse") {
				vitesse = "arret";
			}
			if(etatptn== "hesitant") {
				vitesse = "arret";
			}
		}
		if(etatftc =="rouge") {
			if(etatptn== "attente") {
				vitesse = "arret";
			}
			if(etatptn== "traverse") {
				vitesse = "arret";
			}
			if(etatptn== "hesitant") {
				vitesse = "arret";
			}
		}
		if(etatftc =="orange clignotant") {
			if(etatptn== "attente") {
				vitesse = "lente";
			}
			if(etatptn== "traverse") {
				vitesse = "arret";
			}
			if(etatptn== "hesitant") {
				vitesse = "arret";
			}
		}
		
		  System.out.println("Le Feu Tri Color est en etat de:\n "+ftc.status);
		  System.out.println("Le pieton est en état de:\n "+ptn.status);

		
	}
	
	public Vitessevoiture(String pStatus, String fStatus){
		Ftc ftc = new Ftc(fStatus);
		Pieton ptn = new Pieton(pStatus);
		
		String etatftc= ftc.status;
		String etatptn= ptn.status;
		
		if(etatftc =="vert") {
			if(etatptn== "attente") {
				vitesse = "rapide";
			}
			if(etatptn== "traverse") {
				vitesse = "arret";
			}
			if(etatptn== "hesitant") {
				vitesse = "lente";
			}
		}
		if(etatftc =="orange") {
			if(etatptn== "attente") {
				vitesse = "lente";
			}
			if(etatptn== "traverse") {
				vitesse = "arret";
			}
			if(etatptn== "hesitant") {
				vitesse = "arret";
			}
		}
		if(etatftc =="rouge") {
			if(etatptn== "attente") {
				vitesse = "arret";
			}
			if(etatptn== "traverse") {
				vitesse = "arret";
			}
			if(etatptn== "hesitant") {
				vitesse = "arret";
			}
		}
		if(etatftc =="orange clignotant") {
			if(etatptn== "attente") {
				vitesse = "lente";
			}
			if(etatptn== "traverse") {
				vitesse = "arret";
			}
			if(etatptn== "hesitant") {
				vitesse = "arret";
			}
		}
		
		  System.out.println("Le Feu Tri Color est en etat de:\n "+ftc.status);
		  System.out.println("Le pieton est en état de:\n "+ptn.status);

		
	}
	

}

