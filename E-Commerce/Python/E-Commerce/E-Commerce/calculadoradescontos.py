
class CalculadoraDescontos:
    LIMITE_MINIMO_DESCONTO_COMPRAS_BASICAS = 500.00
    TAXA_DESCONTO_APLICADA_COMPRAS_BASICAS = 0.9

    LIMITE_MINIMO_DESCONTO_COMPRAS_GRANDES = 1000.00
    TAXA_DESCONTO_APLICADA_COMPRAS_GRANDES = 0.8

    TAXA_DESCONTO_APLICADA_COMPRAS_POR_IMPULSO = 0.95
    def calcular(self, valorCompra): 
        if valorCompra >= CalculadoraDescontos.LIMITE_MINIMO_DESCONTO_COMPRAS_GRANDES:
            return valorCompra * CalculadoraDescontos.TAXA_DESCONTO_APLICADA_COMPRAS_GRANDES

        if valorCompra >= CalculadoraDescontos.LIMITE_MINIMO_DESCONTO_COMPRAS_BASICAS:
            return valorCompra * CalculadoraDescontos.TAXA_DESCONTO_APLICADA_COMPRAS_BASICAS
        
        return valorCompra * CalculadoraDescontos.TAXA_DESCONTO_APLICADA_COMPRAS_POR_IMPULSO