package Pacote;

public class Moto {
	  	public String marca;
	    public String modelo;
	    public int ano;
	    public String cor;
	    public int cilindradas;

	    public Moto(String marca, String modelo, int ano, String cor, int cilindradas) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.ano = ano;
	        this.cor = cor;
	        this.cilindradas = cilindradas;
	    }

	    public String descricao() {
	        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor + ", Cilindradas: " + cilindradas;
	    }
	}

