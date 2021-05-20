package ro.ase.cts.pachet.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.pachet.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		// fail("Not yet implemented");
		String nume = "Calin";
		Student student = new Student(nume);

//		if(nume != student.getNume() ) {
//			fail("numele nu este corect");
//		}

		assertEquals(nume, student.getNume());
	}

	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		assertEquals("Student", student.getNume());
	}

	@Test
	public void testAreRestanta() {
		Student student = new Student();
		student.adaugaNota(3);
		student.adaugaNota(10);
		assertTrue("Studentul care are restanta este marcat ca nu are restanta", student.areRestante());
	}

	@Test
	public void testNuAreRestanta() {
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(10);
		assertFalse("Studentul care nu are restanta este marcat ca nu avand restanta", student.areRestante());
	}

	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		student.adaugaNota(7);

		assertEquals(1, student.getNote().size());

	}

	@Test
	public void testVerificareNota() {
		Student student = new Student();
		int nota = 9;
		student.adaugaNota(nota);

		assertEquals(9, student.getNota(0));

	}

	@Test
	public void testCalculeazaMedia() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(6);
		assertEquals(5.5, student.calculeazaMedie(), 0.01);
	}

	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();

		assertEquals(0, student.calculeazaMedie(), 0);
	}

	@Test
	public void testCalucleazaMediePentruONota() {
		Student student = new Student();
		int nota = 7;
		student.adaugaNota(nota);

		assertEquals(nota, student.calculeazaMedie(), 0);
	}

	@Test
	public void testAdaugaNotaIncorecta() {
		Student student = new Student();
		int nota = 14;
		// 1
		try {
			// 2
			student.adaugaNota(nota);
			// 3
			fail("nu trebuia sa ajunga aici");
		} catch (IllegalArgumentException err) {
			// 4
		}
		// 5
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorectaJU4() {
		Student student = new Student();
		int nota = 14;
		student.adaugaNota(nota);
	}

}
