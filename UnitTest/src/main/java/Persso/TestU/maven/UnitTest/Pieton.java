package Persso.TestU.maven.UnitTest;


import java.util.Random;

public class Pieton {
	String status;
	public Pieton() {
		Random rand = new Random(); 
	int	alea = rand.nextInt(3);


		if(alea ==0) {
			status = "attente";
		}
		if(alea ==1) {
			status = "traverse";
		}
		if(alea ==2) {
			status = "hesitant";
		}
	}

	  public  Pieton(String pStatus)
	  {
		  status = pStatus;
	  }


}

