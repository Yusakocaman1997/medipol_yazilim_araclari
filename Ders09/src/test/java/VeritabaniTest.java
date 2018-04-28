import static org.junit.Assert.*;

import org.junit.Test;

import Ders09.VeriTabani;



public class VeritabaniTest {
	@Test
	
	public void testTopleHepsi() {
		int gercekSonuc = VeriTabani.topla(25, 14);
		assertEquals(39,gercekSonuc);
		}
	}

