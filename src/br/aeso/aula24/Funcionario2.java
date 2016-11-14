package br.aeso.aula24;

public class Funcionario2 {
	public static final int DESENVOLVEDOR = 1;
	public static final int GERENTE = 2;
	public static final int DBA = 3;
	protected double salarioBase;
	protected int cargo;
	public double calcularSalarioComImposto() {
        switch (cargo) {
        case DESENVOLVEDOR:
            if (salarioBase >= 2000) {
                return salarioBase * 0.85;
            } else {
                return salarioBase * 0.9;
            }
        case GERENTE:
            if (salarioBase >= 3500) {
                return salarioBase * 0.8;
            } else {
                return salarioBase * 0.85;
            }
        case DBA:
            if (salarioBase >= 2000) {
                return salarioBase * 0.85;
            } else {
                return salarioBase * 0.9;
            }
        default:
            throw new RuntimeException("Cargo n�o encontrado :/");
        }
    }
}
