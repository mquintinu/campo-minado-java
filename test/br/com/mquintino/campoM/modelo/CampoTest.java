package br.com.mquintino.campoM.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CampoTest {

	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		 Campo vizinhoEsquerda = new Campo(3, 2);
		 boolean resultado = campo.adicionarVizinho(vizinhoEsquerda);
		 
		 assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Direita() {	
		Campo vizinhoDireita = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinhoDireita);
				
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Acima() {	
		Campo vizinhoAcima = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinhoAcima);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Abaixo() {	
		Campo vizinhoAbaixo = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinhoAbaixo);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistanciaDiagonal() {	
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinho() {	
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}	

	
}
