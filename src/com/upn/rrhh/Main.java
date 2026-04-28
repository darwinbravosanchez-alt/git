package com.upn.rrhh;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		List<Empleado> lista = new ArrayList<>();
		int cant;
		double prom_sueldo, suma_sueldo = 0;
		
		System.out.print("Ingresar Cant. de Empl.: ");
		cant = teclado.nextInt();
		teclado.nextLine();
		
		for(int i =1; i<=cant; i++) {
			Empleado e = new Empleado();
			
			System.out.println("Persona "+i);
			System.out.print("* Ingresar codigo: ");
			String codigo = teclado.nextLine();
			e.setCod_emp(codigo);
			
			System.out.print("* Ingresar nombre: ");
			String nombre = teclado.nextLine();
			e.setNom_emp(nombre);
			
			System.out.print("* Ingresar sueldo: ");
			double sueldo = teclado.nextDouble();
			teclado.nextLine();
			e.setSueldo(sueldo);
			
			suma_sueldo = suma_sueldo + sueldo;
			
			lista.add(e);
		}
		
		System.out.println("----------------------------");
		int cont = 1;
		for(Empleado x : lista) {
			//System.out.println(x.toString());
			System.out.println("Persona "+cont);
			System.out.println("* Codigo: "+x.getCod_emp());
			System.out.println("* Nombre: "+x.getNom_emp()  );
			System.out.println("* Sueldo: "+x.getSueldo()  );
			cont++;
		}
		System.out.println("----------------------------");
		prom_sueldo = suma_sueldo / cant;
		System.out.println("EL promedio de los sueldo es: "+prom_sueldo);

	}

}
