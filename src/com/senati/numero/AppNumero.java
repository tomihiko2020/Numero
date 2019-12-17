package com.senati.numero;

import java.util.Scanner;

public class AppNumero {

			static public void main(String[] args) {
				// TODO Auto-generated method stub
				try {
	
					Scanner Leer = new Scanner(System.in);
					System.out.print("\n Ingrese el número : ");
					double n = Leer.nextDouble();
					Numero Onum = new Numero(n);
					System.out.println(" " + Onum.Primo());
					System.out.println(" " + Onum.Perfecto());
					System.out.println(" " + Onum.positivo());
					System.out.println(" El cuadrado del numero es:  " + Onum.cuadro());
					System.out.println(" Factorial " + Onum.Factorial());
				}catch (Exception ex) {
									}			
			}



	}


