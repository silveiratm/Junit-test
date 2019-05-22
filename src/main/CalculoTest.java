package main;
import static org.junit.jupiter.api.Assertions.*;

public class CalculoTest {

	void testExecutaCalculo() {
		
		//Define os valores a serem calculados e testados
		float passaValor1 = 10;
		float passaValor2 = 0;
		float retornoEsperado = 15;
		
		Calculo c = new Calculo();
		float retornoFeito = c.soma(passaValor1, passaValor2);
		
		assertEquals(retornoEsperado, retornoFeito);
	}
}
