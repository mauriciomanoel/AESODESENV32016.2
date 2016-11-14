package br.aeso.aula16.prototype;
public class ExemploNota {
	public static void main (String[] args) {
		Nota notaPrototype = new Nota();
		Nota nota1 = (Nota) notaPrototype.clone();
		nota1.setSom("D�");
		Nota nota2 = (Nota) notaPrototype.clone();
		nota2.setSom("R�");
		System.out.println(nota1.getSom());
		System.out.println(nota2.getSom());
	}
}
