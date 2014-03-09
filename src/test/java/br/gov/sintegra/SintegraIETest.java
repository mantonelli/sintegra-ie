package br.gov.sintegra;

import junit.framework.TestCase;

import org.junit.Test;

import br.gov.sintegra.ie.InscricaoEstadual;
import br.gov.sintegra.ie.InscricaoEstadualFactory;

public class SintegraIETest extends TestCase {

	@Test
	public void testIE_AC() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("AC");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("01.004.823/001-12"));
		assertTrue(ie.validar("01.000.941/001-24"));
		assertTrue(ie.validar("01.011.544/001-94"));
	}

	@Test
	public void testIE_AL() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("AL");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("24000004-8"));

	}

	@Test
	public void testIE_AM() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("AM");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("041171616"));
		assertTrue(ie.validar("04.210.308-8"));
	}

	@Test
	public void testIE_AP() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("AP");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("030123459"));
	}

	@Test
	public void testIE_BA() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("BA");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("123456-63"));
		assertTrue(ie.validar("1000003-06"));
	}

	@Test
	public void testIE_CE() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("CE");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("06000001-5"));
	}

	@Test
	public void testIE_DF() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("DF");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("07300001001-09"));
	}

	@Test
	public void testIE_ES() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("ES");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("99999999-0"));
	}

	@Test
	public void testIE_GO() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("GO");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("10.987.654-7"));
	}

	@Test
	public void testIE_MA() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("MA");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("120000385"));
	}

	@Test
	public void testIE_MG() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("MG");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("062.307.904/0081"));
		assertTrue(ie.validar("3720734590007"));
	}

	@Test
	public void testIE_MS() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("MS");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("283115947"));
	}

	@Test
	public void testIE_MT() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("MT");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("0013000001-9"));
		assertTrue(ie.validar("13.183.431-2"));
	}

	@Test
	public void testIE_PA() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("PA");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("15-999999-5"));
	}

	@Test
	public void testIE_PB() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("PB");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("06000001-5"));
	}

	@Test
	public void testIE_PE() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("PE");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("0321418-40"));
	}

	@Test
	public void testIE_PI() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("PI");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("012345679"));
	}

	@Test
	public void testIE_PR() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("PR");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("123.45678-50"));
	}

	@Test
	public void testIE_RJ() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("RJ");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("99.999.99-3"));
	}

	@Test
	public void testIE_RN() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("RN");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("20.040.040-1"));
		assertTrue(ie.validar("20.0.040.040-0"));
	}

	@Test
	public void testIE_RO() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("RO");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("000.62521-3"));
	}

	@Test
	public void testIE_RR() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("RR");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("24006628-1"));
		assertTrue(ie.validar(" 24001755-6"));
		assertTrue(ie.validar(" 24003429-0"));
		assertTrue(ie.validar(" 24001360-3"));
		assertTrue(ie.validar(" 24008266-8"));
		assertTrue(ie.validar(" 24006153-6"));
		assertTrue(ie.validar(" 24007356-2"));
		assertTrue(ie.validar(" 24005467-4"));
		assertTrue(ie.validar("  24004145-5"));
		assertTrue(ie.validar("  24001340-7"));
	}

	@Test
	public void testIE_RS() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("RS");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("224/3658792"));
	}

	@Test
	public void testIE_SC() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("SC");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("251.040.852 "));
	}

	@Test
	public void testIE_SE() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("SE");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("27123456-3 "));
	}

	@Test
	public void testIE_SP() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("SP");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("110.042.490.114"));
		assertTrue(ie.validar("P-01100424.3/002"));
	}

	@Test
	public void testIE_TO() {
		InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("TO");
		assertTrue(ie.validar("isento"));
		assertTrue(ie.validar("290102278-36"));
	}

}
