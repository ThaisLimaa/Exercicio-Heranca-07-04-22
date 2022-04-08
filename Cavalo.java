package ExercíciosGeneration.SetedeAbril;

public class Cavalo extends Animal{

	private String crina;
	
	public Cavalo(String animal, String nome, String idade, String som, String crina)
	{
		super(nome, idade, som, animal);
		this.crina = crina;
	}

	public String getCrina() 
	{
		return crina;
	}

	public void setCrina(String crina) 
	{
		this.crina = crina;
	}
	
	public void imprimeCavalo()
	{
		System.out.println("\nAnimal: "+getanimal()+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom()+"\nHabilidade: "+crina);
	}
	
	
	
	
	
}