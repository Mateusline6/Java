package Metodos;

public class MetodoRetorno {

	String nome ="Mateus";
	
	
	public int consultaIdade() {
		
		return 25;
	}
	
	public String consultaNome() {
		System.out.println("O meu nome é "+ nome);
		return nome;
		
	}
	
	private void secreto() {
		
		System.out.println("Não conseguimos acessar metodo");
	}
	
	
	// Variaveis de atributos no metodos
	
	public void cadastrar(String nome, int idade) {
		
		System.out.println("O nome cadastrado é "+ nome);
		System.out.println("A idade cadastrada é "+ idade);
		
	}
	
}
