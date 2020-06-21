package models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Menu  implements Serializable{
	public void inicio()
	{
		System.out.println("Bem - Vindo ao PetShop Horizon");
		System.out.println("Onde seu Pet é a Estrela no Horizonte\n");
		
	}
	public void menu()	
	{ 
	System.out.println("\t1 - Cadastrar Profissionais");
	System.out.println("\t2 - Listar todos profissionais");
	System.out.println("\t3 - Cadastrar Clientes");
	System.out.println("\t4 - Listar Cliente");
	System.out.println("\t5 - Cadastrar animais");
	System.out.println("\t6 - Listar animais");
	System.out.println("\t7 - Informar a Raça mais comum");
	System.out.println("\t8 - Inforar o Gênero mais comum");
//	System.out.println("\t9 - Relatórios");
	System.out.println("\t0 - Sair");
	
	System.out.println("\nInforme o que deseja fazer: ");
	}
}