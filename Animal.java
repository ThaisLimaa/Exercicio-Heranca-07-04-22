package ExercíciosGeneration.SetedeAbril;

public class Animal {

	private String nome;
	private String idade;
	private String som;
	private String animal;
	
	
	public Animal(String nome, String idade, String som, String animal) 
	{
		super();
        this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.animal = animal;
		
	}
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getIdade() 
	{
		return idade;
	}
	public void setIdade(String idade) 
	{
		this.idade = idade;
	}
	public String getSom() 
	{
		return som;
	}
	public void setSom(String som) 
	{
		this.som = som;
	}	
	public String getanimal() 
	{
		return animal;
	}
	public void setanimal(String animal) 
	{
		this.animal = animal;
	}
}