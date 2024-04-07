package Pacote;

public class Carro {
	    public String marca;
	    public String modelo;
	    public int ano;
	    public String cor;
	    public int numeroPortas;

	    public Carro(String marca, String modelo, int ano, String cor, int numeroPortas) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.ano = ano;
	        this.cor = cor;
	        this.numeroPortas = numeroPortas;
	    }

	    public String descricao() {
	        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor + ", Portas: " + numeroPortas;
	    }
	}


