package br.aeso.aula12.exemplo03;

public class EmissorAssincronoSMS implements Emissor {
	public void envia (String mensagem) {
		System.out.println(" Envio Assincrono por SMS a mensagem : ");
		System.out.println(mensagem);
	}
}