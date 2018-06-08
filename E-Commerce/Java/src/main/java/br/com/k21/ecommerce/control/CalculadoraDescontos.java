package br.com.k21.ecommerce.control;

public class CalculadoraDescontos {

	private static final double LIMITE_MINIMO_DESCONTO_COMPRAS_BASICAS = 500.00;
	private static final double TAXA_DESCONTO_APLICADA_COMPRAS_BASICAS = 0.9;

	private static final double LIMITE_MINIMO_DESCONTO_COMPRAS_GRANDES = 1000.00;
	private static final double TAXA_DESCONTO_APLICADA_COMPRAS_GRANDES = 0.8;

	private static final double TAXA_DESCONTO_APLICADA_COMPRAS_POR_IMPULSO = 0.95;


	public double calcular(double valorCompra) {
		if (valorCompra >= LIMITE_MINIMO_DESCONTO_COMPRAS_GRANDES) {
			return valorCompra * TAXA_DESCONTO_APLICADA_COMPRAS_GRANDES;
		}

		if (valorCompra >= LIMITE_MINIMO_DESCONTO_COMPRAS_BASICAS) {
			return valorCompra * TAXA_DESCONTO_APLICADA_COMPRAS_BASICAS;
		}
		return valorCompra * TAXA_DESCONTO_APLICADA_COMPRAS_POR_IMPULSO;
	}
}
