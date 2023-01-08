import animal.Animals;
import animal.Cachorro;
import java.util.Scanner;


public class zooTeste {

  public static void main(String[] args) {
   Cachorro dog=new Cachorro();
   Scanner tec=new Scanner(System.in);
   
   System.out.println("Nome do cachorro: ");
   dog.nome_c=tec.next();
   
   System.out.println("Cor do Cachorro: ");
   dog.cor_c=tec.next();
   
   System.out.println("Raça do cachorro: ");
   dog.raca_c=tec.next();
   
   System.out.println("idade do cachorro: ");
   dog.idade_c=tec.nextInt();
   
   System.out.println("Altura do cachorro: ");
   dog.altura_c=tec.nextDouble();
   
   System.out.println("Cadastro do seu cachorro feito com sucesso ");
   
  
   
   
   dog.setadd_som("latindo");
   dog.setadd_som(" auauauau");
   
   System.out.println("O seu cachorro está "+dog.getaddSom());
   
   System.out.println("\nVamos para o gato agora");
  
   Gato cat=new Gato();
   System.out.println("Nome do gato");
   cat.nome_g=tec.next();
   
   System.out.println("Cor do gato");
   cat.cor_g=tec.next();
   
   System.out.println("Raça do gato");
   cat.raca_g=tec.next();
   
   System.out.println("Idade do gato");
   cat.idade_g=tec.nextInt();
   
   System.out.println("Altura do gato");
   cat.altura=tec.nextDouble();
   
   cat.setadd_som("miando");
   cat.setadd_som("\nmiaumiaumiau");
   System.out.println(cat.getaddSom());
   System.out.println("Cadastro do gato feito com sucesso ");
   
   
   
   
  }
  

}
