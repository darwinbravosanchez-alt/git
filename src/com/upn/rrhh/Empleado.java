package com.upn.rrhh;

public class Empleado {
	private String cod_emp;
	private String nom_emp;
	private double sueldo;

// LUFFY REY DED LOS PIRATAS - MAIN
	public Empleado() {
	}
	
	public Empleado(String cod_emp, String nom_emp, double sueldo) {
		this.cod_emp = cod_emp;
		this.nom_emp = nom_emp;
		this.sueldo = sueldo;
	}
	
	public String getCod_emp() {
		return cod_emp;
	}

// GOD USOPP - MAIN

	public void setCod_emp(String cod_emp) {
		this.cod_emp = cod_emp;
	}

	public String getNom_emp() {
		return nom_emp;
	}

	public void setNom_emp(String nom_emp) {
		this.nom_emp = nom_emp;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	//toString
	@Override
	public String toString() {
		return "Empleado [cod_emp=" + cod_emp + ", nom_emp=" + nom_emp + ", sueldo=" + sueldo + "]";
	}
	
	
}
