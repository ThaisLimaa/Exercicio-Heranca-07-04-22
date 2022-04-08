package ExercíciosGeneration.SetedeAbril;

public class Cachorro extends Animal{

	private String correr;
	
	public Cachorro (String animal, String nome, String idade, String som, String correr)
	{
		super(nome, idade, som, animal);
		this.correr = correr;
		
	}

	public String getCorrer() 
	{
		return correr;
	}

	public void setCorre(String correr) 
	{
		this.correr = correr;
	}
	
	public void imprimeCachorro()
	{
		System.out.println("\nAnimal: "+getanimal()+ "\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom()+"\nHabilidade: "+correr);
		
	}	
}
