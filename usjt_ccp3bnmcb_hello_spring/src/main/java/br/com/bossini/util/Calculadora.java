package br.com.bossini.util;

public class Calculadora {
	
	public double calculaMedia (double...v) {
		double media = 0;
		for (double d : v) {
			media += d;
		}
		return media / v.length;
	}

}
