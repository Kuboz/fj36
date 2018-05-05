package br.com.caelum.builder;

import java.time.Month;

public class MesPart {

	private int dia;

	public MesPart(int dia) {
		super();
		this.dia = dia;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public AnoPart de(Month mes) {
		// TODO Auto-generated method stub
		return new AnoPart(dia,mes);
	}
	
	public AnoPart de(int mes){	
		return new AnoPart(dia,Month.of(mes));
	}
	
	
}
