package com.clearminds.cuentas.test;

// Exporto la clase Cuenta del paquete cuentas
import com.clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creo un nuevo objeto
		Cuenta cuenta1 = new Cuenta("03476");
		
		// Coloco un valor de saldo al objeto cuenta1
		cuenta1.setSaldo(675);
		
		
		// Creo un nuevo objeto cuenta2
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		
		// Creo un nuevo objeto cuenta3
		Cuenta cuenta3 = new Cuenta("03476");
		
		// Modifico el tipo de cuenta de cuenta3
		cuenta3.setTipo("C");
		
		// Imprimo los valores de los objetos
		
		System.out.println("-------- Valores iniciales ---------\n");
		
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("-------- Valores modificados ---------\n");
		
		// Cambio algunos valores de los objetos
		
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		
		// Imprimo los objetos con los nuevos valores
		
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		// Crear cuenta4
		
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setSaldo(10);
		
		// Crear cuenta 5
		
		Cuenta cuenta5 = new Cuenta("0557", "C", 10);
		cuenta5.setSaldo(10);
		
		// Crear cuenta 6
		
		Cuenta cuenta6 = new Cuenta("0666");
		
		
		// Imprimir los 3 objetos creados
		
		cuenta4.imprimir();
		cuenta5.imprimir();
		cuenta6.imprimir();
	}

}
