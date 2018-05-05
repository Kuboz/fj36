package br.com.caelum;

import java.time.LocalDate;
import java.time.Month;

import br.com.caelum.builder.DateBuilder;

public class TesteBuilder {
	
	public static void main(String[] args) {
		LocalDate date = DateBuilder.dia(5).de(5).de(2018).build();
		System.out.println(date);
	}

}
