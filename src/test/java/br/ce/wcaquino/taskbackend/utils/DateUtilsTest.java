package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Test;

import org.junit.Assert;

public class DateUtilsTest {
	
	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		LocalDate data = LocalDate.of(2030, 01, 01);
		boolean resultado = DateUtils.isEqualOrFutureDate(data);
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		LocalDate data = LocalDate.of(2010, 01, 01);
		boolean resultado = DateUtils.isEqualOrFutureDate(data);
		Assert.assertFalse(resultado);
	}
	
	
	@Test
	public void deveRetornarTrueParaDataAtual() {
		LocalDate data = LocalDate.now();
		boolean resultado = DateUtils.isEqualOrFutureDate(data);
		Assert.assertTrue(resultado);
	}
}
