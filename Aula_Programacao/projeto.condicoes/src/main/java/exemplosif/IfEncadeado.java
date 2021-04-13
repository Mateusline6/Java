package exemplosif;

public class IfEncadeado {

	public static void main(String[] args) {
		int senha = 123;
		boolean liberado = false;
		int senhaCadastrada = 123;

		if (senha == senhaCadastrada) {

			liberado = true;

			if (liberado) {

				System.out.println("Acesso liberado");

			} else {

				System.out.println("O seu acesso nao esta liberado");

			}
			
		} else {

			System.out.println("Acesso negado");

		}

	}

}
