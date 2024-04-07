package Pacote;

public class Principal {
    public static void main(String[] args) {
    	  Carro carro1 = new Carro("Toyota", "Corolla", 2020, "Prata", 4);
          Moto moto1 = new Moto("Honda", "CBR 1000RR", 2021, "Vermelha", 1000);
          
          System.out.println(carro1.descricao());
          System.out.println(moto1.descricao());
      }
  }

