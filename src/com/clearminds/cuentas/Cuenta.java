package com.clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo = "B";
	private double saldo;
	
	// Atributo id solo tiene metodo get para no ser alterado
	public String getId(){
		return id;
	}

	
	// Metodos get y set de tipo y saldo
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Constructores
	
	public Cuenta(String id){
		this.id = id;
		tipo = "A";
		
	}


	public Cuenta(String id, String tipo, double saldo) {
		//super();
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	public void imprimir(){
		
		System.out.println("************************");
		System.out.println("         CUENTA");
		System.out.println("************************");
		System.out.println("Numero de Cuenta: " + getId());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Saldo: USD " + getSaldo());
		System.out.println("************************\n");
		
	}
	
	

}
