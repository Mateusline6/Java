package exemploswhile;

public class ValidaSenha {

	public static void main(String[] args) {
		
		int senha = 123;
		int senhaCadas = 321;
		int tentativas = 3;
		
		while(senha != senhaCadas && tentativas > 0) {
			
			System.out.println("Senha invalida");
			tentativas = tentativas - 1;
		}
		
		System.out.println("Senha bloqueada");
	}

}
