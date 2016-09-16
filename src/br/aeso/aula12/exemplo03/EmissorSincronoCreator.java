package br.aeso.aula12.exemplo03;

public class EmissorSincronoCreator extends EmissorCreator {
	public Emissor create ( int tipoDeEmissor ) {
		if( tipoDeEmissor == EmissorCreator.SMS ) {
			return new EmissorSincronoSMS();
		} else if( tipoDeEmissor == EmissorCreator.EMAIL ) {
			return new EmissorSincronoEmail();
		} else if( tipoDeEmissor == EmissorCreator.JMS ) {
			return new EmissorSincronoJMS();
		} else {
			throw new IllegalArgumentException (" Tipo de emissor n�o suportado ");
		}
	}
}
