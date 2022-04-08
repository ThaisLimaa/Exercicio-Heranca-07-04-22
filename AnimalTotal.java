package ExercíciosGeneration.SetedeAbril;

public class AnimalTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nFicha dos animais");
		Cachorro animal1 = new Cachorro("Cachorro","Apolo","2 anos","Latir","Correr");
	    animal1.imprimeCachorro();
	    
	    System.out.println("\n---------------------------------------------");
		Cavalo animal2 = new Cavalo("Cavalo","Pé de Pano","25 anos","Relinchar","Correr");
	    animal2.imprimeCavalo();
	    
	    System.out.println("\n----------------------------------------------");
		Preguiça animal3 = new Preguiça("Preguiça","Flash","32 anos","Alta-frequência pelas narinas","Subir em árvores");
	    animal3.imprimirPriguiça();
		
		
		
		
	}

}