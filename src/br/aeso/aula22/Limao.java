package br.aeso.aula22;

public class Limao extends CoquetelDecorator {
	public Limao(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Lim�o";
		preco = 0.5;
	}
}
