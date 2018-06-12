import unittest
from calculadoradescontos import *

class test_calculadora_descontos(unittest.TestCase):
    def test_dar_desconto_5porcento_para_compras_abaixo_500_reais(self):
        # Arrange
       calculadoraDescontos = CalculadoraDescontos()
       valorCompra = 499.99
       valorEsperadoAposCalculo = 474.99

       # Act
       valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra)

       # Assert
       self.assertAlmostEqual(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 2)

    def test_dar_desconto_10porcento_para_compras_iguais_500_reais(self):
        # Arrange
       calculadoraDescontos = CalculadoraDescontos()
       valorCompra = 500.00
       valorEsperadoAposCalculo = 450.00

       # Act
       valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra)

       # Assert
       self.assertAlmostEqual(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 2)

    def test_dar_desconto_10porcento_para_compras_iguais_600_reais(self):
        # Arrange
       calculadoraDescontos = CalculadoraDescontos()
       valorCompra = 600.00
       valorEsperadoAposCalculo = 540.00

       # Act
       valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra)

       # Assert
       self.assertAlmostEqual(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 2)

    def test_dar_desconto_10porcento_para_compras_iguais_749_reais_50_centavos(self):
        # Arrange
       calculadoraDescontos = CalculadoraDescontos()
       valorCompra = 739.50
       valorEsperadoAposCalculo = 665.55

       # Act
       valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra)

       # Assert
       self.assertAlmostEqual(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 2)

    def test_dar_desconto_20porcento_para_compras__iguais_1000_reais(self):
        # Arrange
       calculadoraDescontos = CalculadoraDescontos()
       valorCompra = 1000.00
       valorEsperadoAposCalculo = 800.00

       # Act
       valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra)

       # Assert
       self.assertAlmostEqual(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 2)

    def test_dar_desconto_10porcento_para_compras_iguais_999_reais_99_centavos(self):
        # Arrange
       calculadoraDescontos = CalculadoraDescontos()
       valorCompra = 999.99
       valorEsperadoAposCalculo = 899.99

       # Act
       valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra)

       # Assert
       self.assertAlmostEqual(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 2)

    def test_dar_desconto_20porcento_para_compras__iguais_1001_reais(self):
        # Arrange
       calculadoraDescontos = CalculadoraDescontos()
       valorCompra = 1001.00
       valorEsperadoAposCalculo = 800.80

       # Act
       valorRetornadoAposCalculo = calculadoraDescontos.calcular(valorCompra)

       # Assert
       self.assertAlmostEqual(valorEsperadoAposCalculo, valorRetornadoAposCalculo, 2)
if __name__ == '__main__':
    unittest.main()
