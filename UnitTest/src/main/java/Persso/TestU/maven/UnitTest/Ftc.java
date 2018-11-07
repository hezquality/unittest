package Persso.TestU.maven.UnitTest;


import java.util.Random;

public class Ftc {
	String status;
	int alea;
	
	public Ftc() {
	//generer un chiffre aleatoire
		Random rand = new Random(); 
		alea = rand.nextInt(4);
		//Scanner alea = new Scanner(System.in);
		//System.out.println("Veuillez saisir un chiffre :");
		//int feu = alea.nextInt();
		//System.out.println("Vous avez saisi : " + feu);
    status = "orange clignotant";
	if(alea ==0) {
		status = "vert";
	}
	if(alea ==1) {
		status = "orange";
	}
	if(alea ==2) {
		status = "rouge";
	}

	}
  public  Ftc(String pStatus)
	  {
		  status = pStatus;
	  }

}
