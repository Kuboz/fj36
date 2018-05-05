package br.com.caelum.builder;

import java.time.LocalDate;
import java.time.Month;

public class Builder {

	private int dia;
	private Month mes;
	private int ano;

	public Builder(int dia, Month mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public LocalDate build(){
		return LocalDate.of(ano, mes, dia);
	}

}
