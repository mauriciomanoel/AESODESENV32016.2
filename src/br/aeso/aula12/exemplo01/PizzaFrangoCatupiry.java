package br.aeso.aula12.exemplo01;

public class PizzaFrangoCatupiry extends Pizza{
    public void fazer() {
        super.fazer();
        System.out.println("** Colocar queijo");
        System.out.println("** Colocar fil� de peito de frango");
        System.out.println("** Colocar requeij�o catupiry");
        System.out.println("** Levar ao forno por 10 minutos");
    }
    public String tipo() {
    	return "FRANGO CATUPIRY";
    }
}

