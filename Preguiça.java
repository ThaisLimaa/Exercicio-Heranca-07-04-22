package Exerc�ciosGeneration.SetedeAbril;

public class Pregui�a extends Animal{

	private String Subiremarvores;
	
	public Pregui�a (String animal, String nome, String idade, String som, String Subiremarvores)
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
	
	public void imprimirPrigui�a()
	{
		System.out.println("\nAnimal: "+getanimal()+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom()+"\nHabilidade: "+Subiremarvores);
	}
	
	
}