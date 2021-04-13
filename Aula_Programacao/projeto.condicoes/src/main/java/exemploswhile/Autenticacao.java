package exemploswhile;

public class Autenticacao {

	public static void main(String[] args) {

		int senha = 123;
		int senhaCadas = 123;
		int tentativas = 3;

		if (senha != senhaCadas) {
			while (tentativas > 0) {

				System.out.println("Senha invalida");
				tentativas = tentativas - 1;
			}

			System.out.println("Senha bloqueada");
		} else {

			System.out.println("Acesso liberado");
		}
	}

}
