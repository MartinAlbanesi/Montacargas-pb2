package test;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Carga;
import entities.Montacargas;

public class testMontacargas {

	@Test
	public void queSePuedaCrearUnMontacargas() {
		//Preparacion
		Montacargas nuevo;
		final Double PESO_FINAL_ESPERADO = 10.0;
		
		//Ejecucion
		nuevo = new Montacargas(PESO_FINAL_ESPERADO);
		
		//Validacion
		assertNotNull(nuevo);
	}
	
	@Test
	public void queSePuedaCrearUnaCarga() {
		//Preparacion
		Carga nueva;
		final Double PESO_CARGA_ESPERADO = 5.0;
		
		//Ejecucion
		nueva = new Carga(PESO_CARGA_ESPERADO);
				
		//Validacion
		assertNotNull(nueva);
	}
	
	@Test
	public void queSePuedaCargarUnaCargaAlMontacargas() {
		//Preparacion
		Montacargas nuevo;
		final Double PESO_FINAL_ESPERADO = 10.0;
		Carga nueva;
		final Double PESO_CARGA_ESPERADO = 5.0;
		final Integer CANTIDAD_CARGAS_CARGADAS_ESPERADO = 1;
		
		//Ejecucion
		nuevo = new Montacargas(PESO_FINAL_ESPERADO);
		nueva = new Carga(PESO_CARGA_ESPERADO);
		nuevo.agregarCarga(nueva);
		
		//Validacion
		assertEquals(CANTIDAD_CARGAS_CARGADAS_ESPERADO,(Integer)nuevo.getCargas().size());
	}
	
	@Test
	public void queElMontacargasNoPermitaAgregarMasCargasSiElPesoMaximoEsSuperado() {
		//Preparacion
		Montacargas nuevo;
		final Double PESO_FINAL_ESPERADO = 10.0;
		
		Carga carga1;
		final Double PESO_CARGA_ESPERADO1 = 5.0;
		
		Carga carga2;
		final Double PESO_CARGA_ESPERADO2 = 5.0;
		
		final Double PESO_FINAL_EN_MONTACARGAS_ESPERADO = 10.0;
		
		//Ejecucion
		nuevo = new Montacargas(PESO_FINAL_ESPERADO);
		carga1 = new Carga(PESO_CARGA_ESPERADO1);
		carga2 = new Carga(PESO_CARGA_ESPERADO2);
		nuevo.agregarCarga(carga1);
		nuevo.agregarCarga(carga2);
		
		//Validacion
		assertEquals(PESO_FINAL_EN_MONTACARGAS_ESPERADO,nuevo.getPesoTotal());
	}
	
	

}
