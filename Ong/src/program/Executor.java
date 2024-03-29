package program;

import data.BaseDados;

public class Executor {

	public static void main(String[] args) {
		BaseDados bd = new BaseDados();
		
		System.out.println("-----CACHORROS-----");
		for (int i = 0; i < bd.cachorros().size(); i++) {
			System.out.println(bd.cachorros().get(i).getNome());
		}
		
		System.out.println("-----Gatos-----");
		for (int i = 0; i < bd.gatos().size(); i++) {
			System.out.println(bd.gatos().get(i));
		}
	}

}
