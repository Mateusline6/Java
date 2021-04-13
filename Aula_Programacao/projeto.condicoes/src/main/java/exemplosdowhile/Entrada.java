package exemplosdowhile;

public class Entrada {

	public static void main(String[] args) {
		
		int ingressoCliente = 30;
		int ingressoBrincar = 5;
		
		do {
			
			System.out.println("Obrigado por participar "+ ingressoCliente);
			ingressoCliente = ingressoCliente - 5;
			
		} while (ingressoCliente >= ingressoBrincar);
		
		
		System.out.println("Volte Sempre");
		
	}


	
}
