package br.aeso.aula20;
public class JanelaDialogo extends JanelaAbstrata {
	public JanelaDialogo(JanelaImplementada janela) {
		super(janela);
	}
	@Override
	public void desenhar() {
		desenharJanela("Janela de Di�logo");
		desenharBotao("Bot�o Sim");
		desenharBotao("Bot�o N�o");
		desenharBotao("Bot�o Cancelar");
	}
}
