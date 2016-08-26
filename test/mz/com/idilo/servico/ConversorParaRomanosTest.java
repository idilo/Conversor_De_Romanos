package mz.com.idilo.servico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConversorParaRomanosTest {
	
	private ConversorParaRomanos cpr;
	
	@Before
	public void setup(){
		cpr = new ConversorParaRomanos();
	}
	@Test
	public void deveConverterNumerosDaLista() {
		assertEquals("I", cpr.converte(1));
	}
	
	@Test
	public void deveConverteNumerosComDuaLetrasRomanas(){
		assertEquals("II", cpr.converte(2));
	}
	
	@Test
	public void deveConverteNumerosMaiorDeCem(){
		assertEquals("CII", cpr.converte(102));
	}
	
	@Test
	public void deveConverteNumerosMaioresDeMil(){
		assertEquals("MII", cpr.converte(1002));
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveConverterNumerosNegativos(){
		cpr.converte(-2);
	}
	
	@Test
	public void deveConverteNumerosMaioresDeQuatroMill(){
		assertEquals("IVII", cpr.converte(4004));
	}

}
