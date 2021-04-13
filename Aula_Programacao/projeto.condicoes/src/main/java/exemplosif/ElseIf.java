package exemplosif;

public class ElseIf {

	public static void main(String[] args) {

		String opcaoPagamento = "CREDITO";
		
		
		if(opcaoPagamento == "VISTA") {
			
			System.out.println("Você escolher A " + opcaoPagamento);
			
		}else if(opcaoPagamento == "CREDITO") {
			
			System.out.println("Você escolheu a opção " + opcaoPagamento);
			
			
		}else {
			
			System.out.println("Opção invalida");
			
		}
		
	}

}
