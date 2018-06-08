package br.com.k21.ecommerce.control.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import br.com.k21.ecommerce.control.CalculadoraDescontos;

public class CalculadoraDescontosTest {

	@Test
	public void naoDarDescontoParaValoresAbaixoDoLimiteMinimoDeDesconto() {
		// Arrange
		CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
		double valorCompra = 499.99;
		double valorEsperadoAposCalculo = 474.99;
		
		
		//Act
		double valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra);
	
		// Assert
		assertEquals(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 0.001);
	}

	@Test
	public void darDescontoDe10PorCentoParaCompraDe500Reais() {
		// Arrange
		CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
		double valorCompra = 500.00;
		double valorEsperadoAposCalculo = 450.00;
		
		//Act
		double valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra);
	
		// Assert
		assertEquals(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 0.001);
	}


	@Test
	public void darDescontoDe10PorCentoParaCompraDe600Reais() {
		// Arrange
		CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
		double valorCompra = 600.00;
		double valorEsperadoAposCalculo = 540.00;
		
		//Act
		double valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra);
	
		// Assert
		assertEquals(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 0.001);
	}

	@Test
	public void darDescontoDe10PorCentoParaCompraDe739Reais50centavos() {
		// Arrange
		CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
		double valorCompra = 739.50;
		double valorEsperadoAposCalculo = 665.55;

		//Act
		double valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra);
	
		// Assert
		assertEquals(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 0.001);
	}

	@Test
	public void darDescontoDe20PorCentoParaCompraDe1000Reais() {
		// Arrange
		CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
		double valorCompra = 1000.00;
		double valorEsperadoAposCalculo = 800.00;
		
		//Act
		double valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra);
	
		// Assert
		assertEquals(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 0.001);
	}

	@Test
	public void darDescontoDe10PorCentoParaCompraDe999Reais99centavos() {
		// Arrange
		CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
		double valorCompra = 999.99;
		double valorEsperadoAposCalculo = 899.99;
		
		//Act
		double valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra);
	
		// Assert
		assertEquals(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 0.001);
	}

	@Test
	public void darDescontoDe20PorCentoParaCompraDe1001Reais() {
		// Arrange
		CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
		double valorCompra = 1001.00;
		double valorEsperadoAposCalculo = 800.8;
		
		//Act
		double valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra);
	
		// Assert
		assertEquals(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 0.001);
	}
}
