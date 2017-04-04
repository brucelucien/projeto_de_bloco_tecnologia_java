package br.edu.infnet.likert.exemplo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.infnet.likert.exemplo.ClasseExemplo;

public class ClasseExemploTest {

	@Test
	public void testeInutilApenasParaExemplo() {
		ClasseExemplo classeExemplo = new ClasseExemplo();
		assertNotNull(classeExemplo);
	}

}
