package Persso.TestU.maven.UnitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Persso.TestU.maven.UnitTest.Vitessevoiture;

public class TestVoiture {

	Vitessevoiture vvoiture = new Vitessevoiture("traverse", "vert");

	@Test
	public void voiturearretTest() {
		assertEquals("arret", vvoiture.vitesse);
		System.out.println("La voiture roule avec une vitesse:\n --> " + vvoiture.vitesse);
	}

	@Test
	void voiturelenteTest() {
		assertEquals("lente", vvoiture.vitesse);
		System.out.println("La voiture roule avec une vitesse:\n --> " + vvoiture.vitesse);
	}

	@Test
	void voiturerapideTest() {
		assertEquals("rapide", vvoiture.vitesse);
		System.out.println("La voiture roule avec une vitesse:\n --> " + vvoiture.vitesse);
	}
	@Test
	void voituretresrapideTest() {
		assertEquals("rapide", vvoiture.vitesse);
		System.out.println("La voiture roule avec une vitesse:\n --> " + vvoiture.vitesse);
	}

}
