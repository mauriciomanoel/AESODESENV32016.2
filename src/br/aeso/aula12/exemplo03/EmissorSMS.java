package br.aeso.aula12.exemplo03;

public class EmissorSMS implements Emissor {
	public void envia (String mensagem) {
		System.out.println(" Enviando por SMS a mensagem : ");
		System.out.println(mensagem);
	}
}