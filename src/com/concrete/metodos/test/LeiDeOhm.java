package com.concrete.metodos.test;

public class LeiDeOhm {

	public double calcularTensaoEletrica(double resistenciaOhms, double correnteAmperes) {
		return resistenciaOhms * correnteAmperes;
	}

	public double calcularResistenciaeletrica(double tensaoVolts, double correnteAmperes) {
		return tensaoVolts / correnteAmperes;
	}

	public double calcularCorrenteEletrica(double tensaoVolts, double resistenciaOhms) {
		return tensaoVolts / resistenciaOhms;
	}

	public double calcularPotenciaEletrica(double tensaoVolts, double correnteAmperes) {
		return tensaoVolts * correnteAmperes;
	}
}
