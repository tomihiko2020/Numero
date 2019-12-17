package com.senati.numero;

public class Numero {
	public double Num;

	public Numero(double num) {
		super();
		Num = num;
	}

	public Numero() {
		super();
		
			}
	
	public String Primo() {
		String men;
		int a=0;
		for(double i=1;i<=Num;i++) {
			if (Num % i  == 0) {
				a++;
			}
		}
		if (a==2) {
			men="Número es primo";
		}else {
			men="Número no es primo";
		}		
		return men;
	}
	
	public String Perfecto() {
		String men;
		double a=0;
		for (double i=1;i<Num;i++) {
			if (Num % i == 0) {
				a = a + i;
			}
		}
		if (a==Num) {
			men="Número es perfecto";
		}
		else {
			men="Número no es perfecto";
		}
		return men;
	}
	
	public double cuadro() {
		double cuadrado;
		
		cuadrado=Num*Num;
		
	return  cuadrado; 
	}
	
	public String positivo() {
		 if (Num < 0) {

				return "El número es negativo";

			} 
		 else {
				return "El número es positivo";
							}
	}
		
		
	
	
		
	public double Factorial() {
		double fac=1;
		while (Num != 0) {
			fac = fac * Num;
			Num--;
		}
		return fac;
	}
}

	