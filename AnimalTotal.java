package Exerc�ciosGeneration.SetedeAbril;

public class AnimalTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nFicha dos animais");
		Cachorro animal1 = new Cachorro("Cachorro","Apolo","2 anos","Latir","Correr");
	    animal1.imprimeCachorro();
	    
	    System.out.println("\n---------------------------------------------");
		Cavalo animal2 = new Cavalo("Cavalo","P� de Pano","25 anos","Relinchar","Correr");
	    animal2.imprimeCavalo();
	    
	    System.out.println("\n----------------------------------------------");
		Pregui�a animal3 = new Pregui�a("Pregui�a","Flash","32 anos","Alta-frequ�ncia pelas narinas","Subir em �rvores");
	    animal3.imprimirPrigui�a();
		
		
		
		
	}

}