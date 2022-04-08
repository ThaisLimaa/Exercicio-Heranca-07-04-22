package ExercíciosGeneration.SetedeAbril;

public class Preguiça extends Animal{

	private String Subiremarvores;
	
	public Preguiça (String animal, String nome, String idade, String som, String Subiremarvores)
	{
		super(nome, idade, som, animal);
		this.Subiremarvores = Subiremarvores;
	}

	public String getSubiremarvores() 
	{
		return Subiremarvores;
	}

	public void setSubiremarvores(String Subiremarvores) 
	{
		this.Subiremarvores = Subiremarvores;
	}
	
	public void imprimirPriguiça()
	{
		System.out.println("\nAnimal: "+getanimal()+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom()+"\nHabilidade: "+Subiremarvores);
	}
	
	
}