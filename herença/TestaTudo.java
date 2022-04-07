package herença;

public class TestaTudo {

	public static void main(String[] args) {
		
		Cachorro ca = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica pre = new Preguica();
		
		ca.setNome("Kiara");
		ca.setIdade(7);
		
		cav.setNome("Flor");
		cav.setIdade(8);
		
		pre.setNome("Lua");
		pre.setIdade(10);
		
		System.out.println("O nome do cachorro é: " + ca.getNome());
		System.out.println(" Sua idade é: " + ca.getIdade());
		System.out.println();
		ca.andar();
		
		
		System.out.println();
		System.out.println("O nome do cavalo é: " + cav.getNome());
		System.out.println("Sua idade é: "+ cav.getIdade());
		System.out.println();
		cav.parado();
		
		System.out.println();
		System.out.println("O nome da preguiça é: "+pre.getNome());
		System.out.println("Sua idade é: " + pre.getIdade());
		pre.arvore();
		
		
		
		
		
	}

}
