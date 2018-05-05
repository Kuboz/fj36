package br.com.caelum.builder;

import java.time.Month;

public class AnoPart {
	private int dia;
	private Month mes;

	public AnoPart(int dia, Month mes) {
		super();
		this.dia = dia;
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public Month getMes() {
		return mes;
	}

	public void setMes(Month mes) {
		this.mes = mes;
	}

	public Builder de(int ano) {
		// TODO Auto-generated method stub
		return new Builder(dia,mes,ano);
	}

}
