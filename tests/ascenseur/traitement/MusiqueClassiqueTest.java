package ascenseur.traitement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MusiqueClassiqueTest {

	protected AscenseurHautDeGamme asc = new AscenseurHautDeGamme();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		System.out.println(asc.getMusique());
		fail("Not yet implemented");
	}

}
