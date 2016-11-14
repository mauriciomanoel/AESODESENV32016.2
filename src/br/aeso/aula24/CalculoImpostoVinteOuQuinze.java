package br.aeso.aula24;

public class CalculoImpostoVinteOuQuinze implements CalculaImposto {
	public double calculaSalarioComImposto(Funcionario umFuncionario) {
		if (umFuncionario.getSalarioBase() > 3500) {
			return umFuncionario.getSalarioBase() * 0.8;
		}
		return umFuncionario.getSalarioBase() * 0.85;
	}
}
